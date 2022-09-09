import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			
			
			int updateNum = 20;
			String updateName = "kang";
			String updateAddr = "세종";
					
//			String sql = "Update test set name='lee',addr='광주' where num=1";
			String sql = "Update test set name=?,addr=? where num=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, updateName);
			ps.setString(2, updateAddr);
			ps.setInt(3, updateNum);
			
			int count = -1;
			count = ps.executeUpdate(); //성공적으로 실행된 갯수 return, 없으면 0 return
			
			
			if(count == -1)
				System.out.println("수정 실패");
			else if(count == 0)
				System.out.println("조건에 맞는 레코드 없음");
			else
				System.out.println("수정 성공");
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
