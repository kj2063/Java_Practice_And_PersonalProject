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
			System.out.println("1)���� ����  2)���� ����  3)���� �α���  4)��� ���� Ȯ��  5)����");
			System.out.print("������ ��ȣ �Է�>>");
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
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
				break;
			default:	
				System.out.println("������ �� �ִ� ��ȣ�� �ƴմϴ�.");
			}
			
		}
		
	}//init()
	
	
	
	public void createAccount(){
		System.out.print("���� ���̵� �Է� : ");
		String id = sc.next();
		System.out.print("���� ��й�ȣ �Է� : ");
		String pw = sc.next();
		
		MyJDBC_Bean bean = new MyJDBC_Bean(id,pw);
		dao.createAccount(bean);
	}//createAccount()
	
	public void removeAccount() {
		System.out.print("���� ���̵� �Է� : ");
		String id = sc.next();
		System.out.print("���� ��й�ȣ �Է� : ");
		String pw = sc.next();
		
		MyJDBC_Bean bean = new MyJDBC_Bean(id, pw);
		dao.removeAccount(bean);
	}
	
	public void loginAccount() {
		System.out.print("�α��� ���̵� �Է� : ");
		String id = sc.next();
		System.out.print("�α��� ��й�ȣ �Է� : ");
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
