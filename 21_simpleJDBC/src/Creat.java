import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Creat {
	public static void main(String[] args) {
		
		/*
		java에서 SQL사용하기

		java project => property =>java build path => libraries =>classpath찍고  add external jars
		
		경로:C:\Oracle\product\12.2.0\dbhome_1\jdbc\lib 의 ojdbc8 파일	
		*/
		
		String driver = "oracle.jdbc.driver.OracleDriver"; //oracle.jdbc.driver 패키지의 OracleDriver클래스를 쓸거임. 
								                           //패키지는 ojdbc8.jar에 있음. 따라서 사용하려면 가져와야 함
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //내컴퓨터에 설치된 oracle에 접속하기 위한 url => jdbc:oracle:thin:@IP주소:포트번호:orcl
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			//JDBC 프로그래밍 단계 (JDBC :자바(J)와 데이터베이스(DB)를 연결(C)하여 사용하는것)
			// 0. ojdbc8.jar 추가 후
			// 1. 드라이버 로드
			Class.forName(driver);//driver 위치의 oracle 드라이버를 가져오는 명령어
			System.out.println("드라이버 로드 성공");
			
			// 2. 계정에 접속
			Connection conn = DriverManager.getConnection(url, id, pw);//conn 변수에 접속 정보가 들어감
			System.out.println("접속 성공");
			
			//### DB에서 처리할 명령 ###
			
			String sql = "drop table test"; //테이블이 없는데 지우려고 하면 SQLException 발생
			// 3. sql문 분석
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 4. sql문 실행
			ps.executeUpdate(sql);
			
			sql = "create table test(\r\n"
					+ "	num number,\r\n"
					+ "	name varchar2(20),\r\n"
					+ "	addr varchar2(30)\r\n"
					+ ")";
			
			ps = conn.prepareStatement(sql);
			ps.executeUpdate(sql);
			
			
			ps.close();//분석기도 닫아줘야 한다
			//#######################
			
			// 마지막단게. 접속 끊기
			conn.close();
			System.out.println("접속 끊기 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("접속 실패");
		}
		
	}
}
