import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyJDBC_Dao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	Connection conn;
	String sql;
	
	MyJDBC_Dao(){
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB로그인 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB로그인 실패");
		}
		
		
		
		
	}//MyJDBC_Dao 생성자
	
	
	public void createAccount(MyJDBC_Bean bean) {
		sql = "insert into idpw_test values(?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPw());
			
			int count = -1;
			count = ps.executeUpdate();
			if(count == -1) {
				System.out.println("생성 실패");
			}else {
				System.out.println("생성 성공");
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("생성 에러 발생");
			System.out.println(e.getMessage());
		}
	}//createAccount
	
	public void removeAccount(MyJDBC_Bean bean) {
		sql = "delete idpw_test where id=? and pw=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPw());
			
			int count = -1;
			count = ps.executeUpdate();
			if(count == -1) {
				System.out.println("삭제 실패");
			}else if(count == 0) {
				System.out.println("삭제할 계정이 없습니다");
			}else {
				System.out.println("삭제 성공");
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("삭제 에러발생");
			System.out.println(e.getMessage());
		}
	}
	
	public void loginAccount(MyJDBC_Bean bean) {
		sql = "select * from idpw_test where id=? and pw=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPw());
			
			ResultSet rs = ps.executeQuery();
						
			if(rs.next()) {
				String id = rs.getString("id");
				System.out.println(id +" 로그인 성공");
			}else {
				System.out.println("존재하지 않는 계정입니다");
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("로그인 실패");
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<MyJDBC_Bean> showAccount() {
		ArrayList<MyJDBC_Bean> arr = new ArrayList<MyJDBC_Bean>();
		
		sql = "select * from idpw_test";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				
				MyJDBC_Bean bean = new MyJDBC_Bean(id,pw);
				arr.add(bean);
			}//while
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arr;
	}
	
}//MyJDBC_Dao
