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
			String insertAddr = "����";
			/*
			String sql = "insert into test values(3,'choi','����')";
			
			or
			
			String sql = "insert into test values(" + insertNum + ",'" + insertName + "','" + insertAddr +"')";
			
			or
			*/
			String sql = "insert into test values(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql); //�м��ߴ��� ?�� �ֳ� => ä���ֱ�
			// 4.?(��ġȦ��) �ڸ��� �� ä���ֱ�
			ps.setInt(1, insertNum); //1��° ?�ڸ��� insertNum���� ����
			ps.setString(2, insertName);
			ps.setString(3, insertAddr);

			int count = ps.executeUpdate(); //���������� insert�� ������ return��.
			
			if(count == 0) {
				System.out.println("���� ����");
			} 
			else {
				System.out.println("���� ����");
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
