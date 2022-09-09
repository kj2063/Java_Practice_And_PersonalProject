import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyJDBC_Main {
	
	MyJDBC_Dao dao = new MyJDBC_Dao();
	MyJDBC_Bean bean = new MyJDBC_Bean();
	
	Scanner sc = new Scanner(System.in);
	
	MyJDBC_Main(){
		init();
	}
	
	public void init() {
	
		while(true) {
			System.out.println("====================================================");
			System.out.println("1)계정 생성  2)계정 삭제  3)계정 로그인  4)모든 계정 확인  5)종료");
			System.out.print("실행할 번호 입력>>");
			String selectNum = sc.next();
			
			switch(selectNum) {
			case "1":
				createAccount();
				break;
			case "2":
				removeAccount();
				break;
			case "3":
				loginAccount();
				break;
			case "4":
				showAccount();
				break;
			case "5":
				sc.close();
				try {
					dao.conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default:	
				System.out.println("실행할 수 있는 번호가 아닙니다.");
			}
			
		}
		
	}//init()
	
	
	
	public void createAccount(){
		System.out.print("생성 아이디 입력 : ");
		String id = sc.next();
		System.out.print("생성 비밀번호 입력 : ");
		String pw = sc.next();
		
		MyJDBC_Bean bean = new MyJDBC_Bean(id,pw);
		dao.createAccount(bean);
	}//createAccount()
	
	public void removeAccount() {
		System.out.print("삭제 아이디 입력 : ");
		String id = sc.next();
		System.out.print("삭제 비밀번호 입력 : ");
		String pw = sc.next();
		
		MyJDBC_Bean bean = new MyJDBC_Bean(id, pw);
		dao.removeAccount(bean);
	}
	
	public void loginAccount() {
		System.out.print("로그인 아이디 입력 : ");
		String id = sc.next();
		System.out.print("로그인 비밀번호 입력 : ");
		String pw = sc.next();
		
		MyJDBC_Bean bean = new MyJDBC_Bean(id,pw);
		dao.loginAccount(bean);
	}
	
	public void showAccount() {
		System.out.println("ID\tPW");
		
		ArrayList<MyJDBC_Bean> arr = dao.showAccount(); //ArrayList<MyJDBC_Bean> arr
		
		for(MyJDBC_Bean a : arr) {
			System.out.println(a.getId() +"\t"+ a.getPw());
		}
	}
	
	public static void main(String[] args) {
		new MyJDBC_Main();
	}//main

}//end Class
