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
	Connection conn;
	
	
	PersonDao(){
		System.out.println("PersonDao() 생성자");
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} 
		
	}
	
	public void getConnection() {
		try {
			// 2. 계정에 접속
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("접속 성공");
		} catch (SQLException e) {
			System.out.println("접속 실패");
		}
		
	}
	
	public ArrayList<PersonBean> getAllPerson(){
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();

		getConnection();
		
		String sql = "select * from person";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String birth = rs.getString("birth");
				
				PersonBean pb = new PersonBean();
				pb.setNum(num);
				pb.setName(name);
				pb.setAge(age);
				pb.setGender(gender);
				pb.setBirth(birth);
				
				lists.add(pb);
				//PersonMain Class에서 PersonBean Class를 사용하여 처리
				
				//System.out.println(num +", "+ name +", "+ age +", "+ gender +", "+ birth);
			}
			
			
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lists;
	}//getAllPerson()
	
	public ArrayList<PersonBean> findGender(String gender) {
		getConnection();
		
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();
		
		String sql = "select * from person where gender=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,gender);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String gender2 = rs.getString("gender");
			String birth = rs.getString("birth");
			
//			System.out.println(num + " " + name + " " + age + " " + gender2 + " " + birth);
			PersonBean pb = new PersonBean();
			pb.setNum(num);
			pb.setName(name);
			pb.setAge(age);
			pb.setGender(gender2);
			pb.setBirth(birth);
			
			lists.add(pb);
			
			
			rs.close();
			ps.close();
			conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lists;
	}
	
	public void insertData(PersonBean bean) {
		getConnection();
		
		String sql = "insert into person(num,name,age,gender,birth) "
				+ 		"values(perseq.nextval,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getAge());
			ps.setString(3, bean.getGender());
			ps.setString(4, bean.getBirth());
			
			int coung = ps.executeUpdate();
			
			
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateData(PersonBean bean) {
		getConnection();
		
		String sql = "update person set name=?,age=?,gender=?,birth=? where num=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getAge());
			ps.setString(3, bean.getGender());
			ps.setString(4, bean.getBirth());
			ps.setInt(5, bean.getNum());
			
			int count = ps.executeUpdate();
			
			
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteData(int num) {
		getConnection();
		
		String sql = "delete person where num=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			
			int count = ps.executeUpdate();
		
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}	
