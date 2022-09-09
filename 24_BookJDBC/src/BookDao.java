import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String nrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	
	Connection conn;
	String sql;
	
	
	BookDao(){
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(nrl,id,pw);
			System.out.println("DB 로그인 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 로그인 실패");
		}
		
	}//BookDao생성자

	
	public ArrayList<BookBean> showAll() {
		ArrayList<BookBean> arr = new ArrayList<BookBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sql = "select * from book order by no";

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no =rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
//				String pub_day = rs.getString("pub_day");
				Date s = rs.getDate("pub_day");
				String pub_day = String.valueOf(s);
				
				BookBean bean = new BookBean(no,title,author,publisher,price,pub_day);
				arr.add(bean);
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
	
	public ArrayList<BookBean> showSelected(String selectNum) {
		
		ArrayList<BookBean> arr = new ArrayList<BookBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = BookMain.sc;
		String select;
		String name;
		
		if(selectNum.equals("1")) {//제목
			System.out.print("조회할 제목 : ");
			select = sc.next();
			name = "%"+select+"%";
			
			sql = "select * from book where title like ?";
			
		}
		else if(selectNum.equals("2")) {//저자
			System.out.print("조회할 저자 : ");
			select = sc.next();
			name = "%"+select+"%";
			
			sql = "select * from book where author like ?";
		}
		else if(selectNum.equals("3")) {//출판사
			System.out.print("조회할 출판사 : ");
			select = sc.next();
			name = "%"+select+"%";
			
			sql = "select * from book where publisher like ?";
		}
		else {
			System.out.print("올바른 번호가 아닙니다");
			
			return null;
		}
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no =rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				String pub_day = rs.getString("pub_day");
				
				BookBean bean = new BookBean(no,title,author,publisher,price,pub_day);
				arr.add(bean);
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
	}//showSelected
	
	public int update(BookBean bean) {
		PreparedStatement ps = null;
		int count = -1;
		
		String sql = "update book set title=?,author=?,publisher=?,price=?,pub_day=? where no=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,bean.getTitle());
			ps.setString(2,bean.getAuthor());
			ps.setString(3,bean.getPublisher());
			ps.setInt(4,bean.getPrice());
			ps.setString(5,bean.getPub_day());
			ps.setInt(6,bean.getNo());
			
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
	}
	
	
	public int delete(int no) {
		PreparedStatement ps = null;
		int count = -1;
		
		sql = "delete book where no=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,no);
			
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
	}
	
	
	public int insert(BookBean bean) {
		PreparedStatement ps = null;
		int count = -1;
		
		sql = "insert into book values(bseq.nextval,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,bean.getTitle());
			ps.setString(2,bean.getAuthor());
			ps.setString(3,bean.getPublisher());
			ps.setInt(4,bean.getPrice());
			ps.setString(5,bean.getPub_day());

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
	}
	
	
}//end Dao Class
