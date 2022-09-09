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
			String updateAddr = "����";
					
//			String sql = "Update test set name='lee',addr='����' where num=1";
			String sql = "Update test set name=?,addr=? where num=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, updateName);
			ps.setString(2, updateAddr);
			ps.setInt(3, updateNum);
			
			int count = -1;
			count = ps.executeUpdate(); //���������� ����� ���� return, ������ 0 return
			
			
			if(count == -1)
				System.out.println("���� ����");
			else if(count == 0)
				System.out.println("���ǿ� �´� ���ڵ� ����");
			else
				System.out.println("���� ����");
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
