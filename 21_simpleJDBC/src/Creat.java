import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Creat {
	public static void main(String[] args) {
		
		/*
		java���� SQL����ϱ�

		java project => property =>java build path => libraries =>classpath���  add external jars
		
		���:C:\Oracle\product\12.2.0\dbhome_1\jdbc\lib �� ojdbc8 ����	
		*/
		
		String driver = "oracle.jdbc.driver.OracleDriver"; //oracle.jdbc.driver ��Ű���� OracleDriverŬ������ ������. 
								                           //��Ű���� ojdbc8.jar�� ����. ���� ����Ϸ��� �����;� ��
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //����ǻ�Ϳ� ��ġ�� oracle�� �����ϱ� ���� url => jdbc:oracle:thin:@IP�ּ�:��Ʈ��ȣ:orcl
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			//JDBC ���α׷��� �ܰ� (JDBC :�ڹ�(J)�� �����ͺ��̽�(DB)�� ����(C)�Ͽ� ����ϴ°�)
			// 0. ojdbc8.jar �߰� ��
			// 1. ����̹� �ε�
			Class.forName(driver);//driver ��ġ�� oracle ����̹��� �������� ��ɾ�
			System.out.println("����̹� �ε� ����");
			
			// 2. ������ ����
			Connection conn = DriverManager.getConnection(url, id, pw);//conn ������ ���� ������ ��
			System.out.println("���� ����");
			
			//### DB���� ó���� ��� ###
			
			String sql = "drop table test"; //���̺��� ���µ� ������� �ϸ� SQLException �߻�
			// 3. sql�� �м�
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 4. sql�� ����
			ps.executeUpdate(sql);
			
			sql = "create table test(\r\n"
					+ "	num number,\r\n"
					+ "	name varchar2(20),\r\n"
					+ "	addr varchar2(30)\r\n"
					+ ")";
			
			ps = conn.prepareStatement(sql);
			ps.executeUpdate(sql);
			
			
			ps.close();//�м��⵵ �ݾ���� �Ѵ�
			//#######################
			
			// �������ܰ�. ���� ����
			conn.close();
			System.out.println("���� ���� ����");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ����");
		}
		
	}
}
