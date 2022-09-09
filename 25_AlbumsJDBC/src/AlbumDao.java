import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	
	Connection conn;
	
	AlbumDao(){
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB 로그인 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 로그인 실패");
		}
	}//AlbumDao 생성자

	public ArrayList<AlbumBean> showAll() {
		ArrayList<AlbumBean> arr = new ArrayList<AlbumBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from albums";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				Date s = rs.getDate("pub_day");
				String pub_day = String.valueOf(s);
				
				AlbumBean ab = new AlbumBean(num,song,singer,company,price,pub_day);
				arr.add(ab);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
						
		return arr;		
	}//showAll()
	
	public ArrayList<AlbumBean> selectShow(String colname, String name){
		ArrayList<AlbumBean> arr = new ArrayList<AlbumBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String setName;
		
		
		String sql = "select * from albums where upper(" + colname + ") like ? order by num";
		
		try {
			ps = conn.prepareStatement(sql);
			setName = "%" + name + "%";
			ps.setString(1, setName);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				Date s = rs.getDate("pub_day");
				String pub_day = String.valueOf(s);
				
				AlbumBean ab = new AlbumBean(num,song,singer,company,price,pub_day);
				arr.add(ab);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arr;
	}//selectShow()
	
	public ArrayList<AlbumBean> showPriceRank(int firstNum, int lastNum){
		ArrayList<AlbumBean> arr = new ArrayList<AlbumBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from (select num,song,singer,company,price,pub_day,rank() over (order by price desc) ranking  from albums) "
				+ "where ranking between ? and ? order by ranking, singer";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, firstNum);
			ps.setInt(2, lastNum);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				Date s = rs.getDate("pub_day");
				String pub_day = String.valueOf(s);
				
				AlbumBean ab = new AlbumBean(num,song,singer,company,price,pub_day);
				arr.add(ab);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arr;
	}//showPriceRank
	
	public int update(AlbumBean ab) {
		PreparedStatement ps = null;
		int count = -1;
		
		String sql = "update albums set song=?, singer=?, company=?, price=?, pub_day=? where num=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ab.getSong());
			ps.setString(2, ab.getSinger());
			ps.setString(3, ab.getCompany());
			ps.setInt(4, ab.getPrice());
			ps.setString(5, ab.getPub_day());
			ps.setInt(6, ab.getNum());
			
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}//update()
	
	
	public int delete(int selectNum) {
		PreparedStatement ps = null;
		int count = -1;
		
		String sql = "delete albums where num=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, selectNum);
			
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}//delete()
	
	
	public int insert(AlbumBean ab) {
		PreparedStatement ps = null;
		int count = -1;
		
		String sql = "insert into albums values(albumseq.nextval,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ab.getSong());
			ps.setString(2, ab.getSinger());
			ps.setString(3, ab.getCompany());
			ps.setInt(4, ab.getPrice());
			ps.setString(5, ab.getPub_day());
			
			count = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}//insert()
	
	public ArrayList<AlbumBean> arrange(String colName, String ascOrDesc){
		ArrayList<AlbumBean> arr = new ArrayList<AlbumBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String str = colName + " " + ascOrDesc;
		
		String sql = "select * from albums order by " + str;
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				Date s = rs.getDate("pub_day");
				String pub_day = String.valueOf(s);
				
				AlbumBean ab = new AlbumBean(num,song,singer,company,price,pub_day);
				arr.add(ab);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arr;
	}//arrange()
	

}//end Class
