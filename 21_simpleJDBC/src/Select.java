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
			System.out.println("����̹� �ε� ����");
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("���� ����");
			
			String sql = "select * from test";
			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.executeUpdate();
			ResultSet rs = ps.executeQuery();
			/*
			���� �� ���� rs�� ����
			1 kim ����
			2 park �λ�
			*/
			while(rs.next()) { //rs.next =>rs�� �����ϴ°��� �ִ°�? ������ true�� return, ������ false
				int num = rs.getInt("num");// num colum�� �� �ִ� ���ڸ� �����ͺ���
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + ", " + name + ", " + addr);
			}
			
			rs.close();
			ps.close();

			
			conn.close();
			System.out.println("���� ���� ����");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
