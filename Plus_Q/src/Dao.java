import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	
	Connection conn;
	
	Dao(){
		try {
			Class.forName(driver);
			System.out.println("����̹� �ε� ����");
			
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB �α��� ����");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB �α��� ����");
		}
	}//Dao ������
	
	public void firstQ(){
//		ArrayList<>
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select p.code, pname, cname, cprice\r\n"
					+ "from producer p inner join consumer c\r\n"
					+ "on p.code = c.code;\r\n";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String code = rs.getString("code");
				String pname = rs.getString("pname");
				String cname = rs.getString("cname");
				int cprice = rs.getInt("cprice");
				
				
				Bean
				setCode(code);
				
				
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
	
	public void secondQ() {
		
	}
	
	
	
}
