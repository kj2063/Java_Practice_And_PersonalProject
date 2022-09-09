import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			int insertNum = 4;
			String insertName = "jung";
			String insertAddr = "경주";
			/*
			String sql = "insert into test values(3,'choi','제주')";
			
			or
			
			String sql = "insert into test values(" + insertNum + ",'" + insertName + "','" + insertAddr +"')";
			
			or
			*/
			String sql = "insert into test values(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql); //분석했더니 ?가 있네 => 채워넣기
			// 4.?(위치홀더) 자리에 값 채워넣기
			ps.setInt(1, insertNum); //1번째 ?자리에 insertNum값을 넣음
			ps.setString(2, insertName);
			ps.setString(3, insertAddr);

			int count = ps.executeUpdate(); //성공적으로 insert된 갯수가 return됨.
			
			if(count == 0) {
				System.out.println("삽입 실패");
			} 
			else {
				System.out.println("삽입 성공");
			}
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
