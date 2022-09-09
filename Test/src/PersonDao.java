import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	Connection conn ;
	
	//new PersonDao()
	PersonDao(){
		System.out.println("PersonDao() 생성자");

		//0. jar화일 추가
		try {
			//1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}

	}// 생성자
	
	public void getConnection(){
		try {
			//2.계정에 접속
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
			
		} catch (SQLException e) {
			System.out.println("접속 실패");
		}
	}
	
	public ArrayList<PersonBean> getAllPerson(){
		
		getConnection();
		
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();

		//3.
		String sql = "select * from person";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 4.sql문 실행
			ResultSet rs = ps.executeQuery();
			 //1 효정               23 여     00/03/04
	         //2 정국               72 남     71/09/01
	         //3 슬기               12 여     09/12/24
	         //4 지민               32 남     87/01/27
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String birth = rs.getString("birth");
				//System.out.println(num+","+name+","+age+","+gender+","+birth);
				
				PersonBean pb = new PersonBean();
				pb.setNum(num);
				pb.setName(name);
				pb.setAge(age);
				pb.setGender(gender);
				pb.setBirth(birth);
				
				lists.add(pb);
			}
			
			rs.close();
			ps.close();
			conn.close();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lists;
		
	}
	
}





