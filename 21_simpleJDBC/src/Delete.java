import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			int deleteNum = 2;
			
			String sql = "delete test where num=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deleteNum);
			
			int count = -1;
			count = ps.executeUpdate();
			
			if(count == -1)
				System.out.println("���� ����");
			else if(count == 0)
				System.out.println("������ �����Ͱ� �����ϴ�");
			else
				System.out.println("���� �Ϸ�");
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
