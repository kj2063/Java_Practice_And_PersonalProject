import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	
	Connection conn;
	String sql;
	
	Dao(){
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
	}//Dao생성자
	
	public int insert_Sta(String sta) {
		int cnt = -1;
		PreparedStatement ps = null;
		
		sql = "insert into station values(?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,sta);
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cnt;
	}//insert_Sta()
	
	public int delete_Sta(String staName) {
		int cnt = -1;
		PreparedStatement ps = null;
		
		sql = "delete station where sta=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,staName);
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cnt;
	}//delete_Sta()
	
	public ArrayList<String> showStation() {
		ArrayList<String> arr = new ArrayList<String>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sql = "select * from station order by sta";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String sta = rs.getString("sta");
				
				arr.add(sta);
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
	}

	public ArrayList<Bean> showAll(){
		ArrayList<Bean> arr = new ArrayList<Bean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sql = "select distinct * from proposer order by cat, sub_cat, sta, name";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cat = rs.getString("cat");
				String sub_cat = rs.getString("sub_cat");
				String sta = rs.getString("sta");
				String name = rs.getString("name");
				String sign = rs.getString("sign");
				String tel = rs.getString("tel");
				
				Bean mb = new Bean(cat,sub_cat,sta,name,sign,tel);
				arr.add(mb);
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
	}
	
	public ArrayList<Bean> showSelected(Bean mb1){
		ArrayList<Bean> arr = new ArrayList<Bean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String station = mb1.getSta();
		String find_sta = "'%" + station + "%'"; 
		try {
			System.out.println("cat: "+mb1.getCat());
			System.out.println("sub_cat: "+mb1.getSub_cat());
			System.out.println("sta :" +mb1.getSta());
			
			if(mb1.getCat() == null && mb1.getSub_cat() == null) { 
				sql = "select distinct * from proposer where sta like "+ find_sta;
				
				ps = conn.prepareStatement(sql);
				
			}
			else if(mb1.getSub_cat() == null && mb1.getSta() == null) {
				sql = "select distinct * from proposer where cat=?";
				
				ps = conn.prepareStatement(sql);
				ps.setString(1,mb1.getCat());
			}
			else if(mb1.getSta() == null) {
				sql = "select distinct * from proposer where cat=? and sub_cat=?";
				ps = conn.prepareStatement(sql);
				ps.setString(1,mb1.getCat());
				ps.setString(2,mb1.getSub_cat());
			}
			else if(mb1.getSub_cat() == null) {
				sql = "select distinct * from proposer where cat=? and sta like " + find_sta;
				
				ps = conn.prepareStatement(sql);
				ps.setString(1,mb1.getCat());
				
			}
			else {
				sql = "select distinct * from proposer where cat=? and sub_cat=? and sta like ?";
				
				ps = conn.prepareStatement(sql);
				ps.setString(1,mb1.getCat());
				ps.setString(2,mb1.getSub_cat());
				ps.setString(3,find_sta);

			}
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cat = rs.getString("cat");
				String sub_cat = rs.getString("sub_cat");
				String sta = rs.getString("sta");
				String name = rs.getString("name");
				String sign = rs.getString("sign");
				String tel = rs.getString("tel");
				
				Bean mb = new Bean(cat,sub_cat,sta,name,sign,tel);
				arr.add(mb);
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
	}//showSelected()
	
	public int insert(Bean b) {
		int cnt = -1;
		PreparedStatement ps = null;
		
		sql = "insert into proposer values(?,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,b.getCat());
			ps.setString(2,b.getSub_cat());
			ps.setString(3,b.getSta());
			ps.setString(4,b.getName());
			ps.setString(5,b.getSign());
			ps.setString(6,b.getTel());
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return cnt;
	}//insert()
	
	public int update(Bean b_before,Bean b_after) {
		int cnt = -1;
		PreparedStatement ps = null;
		try {
			if(b_before.getSta() == "null") {
				System.out.println("여기");
				sql = "update proposer set cat=?, sub_cat=?, sta=?, name=?, sign=?, tel=?  where sta is null and cat=? and name=?";
				
				ps = conn.prepareStatement(sql);
				ps.setString(1,b_after.getCat());
				ps.setString(2,b_after.getSub_cat());
				ps.setString(3,b_after.getSta());
				ps.setString(4,b_after.getName());
				ps.setString(5,b_after.getSign());
				ps.setString(6,b_after.getTel());
				ps.setString(7,b_before.getCat());
				ps.setString(8,b_before.getName());
			}
			else {
				sql = "update proposer set cat=?, sub_cat=?, sta=?, name=?, sign=?, tel=?  where cat=? and sta=? and name=?";

				ps = conn.prepareStatement(sql);
				ps.setString(1,b_after.getCat());
				ps.setString(2,b_after.getSub_cat());
				ps.setString(3,b_after.getSta());
				ps.setString(4,b_after.getName());
				ps.setString(5,b_after.getSign());
				ps.setString(6,b_after.getTel());
				ps.setString(7,b_before.getCat());
				ps.setString(8,b_before.getSta());
				ps.setString(9,b_before.getName());
			}
			
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
				
		return cnt;
	}//update()
	
	public int delete(Bean b) {
		int cnt = -1;
		PreparedStatement ps = null;
		
		sql = "delete proposer where cat=? and sta=? and name=?";
		
		try {
			System.out.println(b.getCat() + "  " + b.getSta() + "  " + b.getName());
			ps = conn.prepareStatement(sql);
			ps.setString(1,b.getCat());
			ps.setString(2,b.getSta());
			ps.setString(3,b.getName());
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return cnt;
	}//delete()
	
}
