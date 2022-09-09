import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
			
			String sql = "select * from test";
			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.executeUpdate();
			ResultSet rs = ps.executeQuery();
			/*
			다음 두 줄을 rs가 관리
			1 kim 서울
			2 park 부산
			*/
			while(rs.next()) { //rs.next =>rs가 관리하는것이 있는가? 있으면 true를 return, 없으면 false
				int num = rs.getInt("num");// num colum에 들어가 있는 숫자를 가져와봐라
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + ", " + name + ", " + addr);
			}
			
			rs.close();
			ps.close();

			
			conn.close();
			System.out.println("접속 끊기 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
