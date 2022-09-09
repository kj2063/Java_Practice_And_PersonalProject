import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
	
	BookDao dao = new BookDao();
	BookBean bean = new BookBean();
	
	static Scanner sc = new Scanner(System.in);
	
	
	BookMain(){
		init();
	}
	
	public void init() {
		while(true) {
			System.out.println("======�޴� �����ϱ�======");
			System.out.println("1.��ü ���� ��ȸ");
			System.out.println("2.���� ��ȸ");
			System.out.println("3.���� ����");
			System.out.println("4.���� ����");
			System.out.println("5.���� �߰�");
			System.out.println("6.���α׷� ����");
			System.out.print(">> �޴� ��ȣ �Է� : ");
			String selectNum = sc.next();
			
			switch(selectNum) {
			case "1":
				showAll();
				break;
			case "2":
				showSelected();
				break;
			case "3":
				update();
				break;
			case "4":
				delete();
				break;
			case "5":
				insert();
				break;
			case "6":
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
				System.out.println("�ùٸ� ��ȣ�� �ƴմϴ�");
			}//switch
			
			
		
		}//while
		
	}//init()
	
	
	public void showAll(){
		ArrayList<BookBean> arr = dao.showAll();
		
		System.out.println("��ȣ\tå����\t����\t���ǻ�\t����\t�Ⱓ��");
		for(BookBean bean : arr) {
			System.out.println(bean.getNo() +"\t"+ bean.getTitle() +"\t"+ bean.getAuthor() +"\t"+ bean.getPublisher() +"\t"+ bean.getPrice() +"\t"+ bean.getPub_day());
		}
	}//showAll()
	
	
	public void showSelected() {
		System.out.print("����:1   ����:2   ���ǻ�:3    ��ȣ�Է�>>");
		String selectNum = sc.next();
		
		ArrayList<BookBean> arr = dao.showSelected(selectNum);
		
		System.out.println("��ȣ\tå����\t����\t���ǻ�\t����\t�Ⱓ��");
		for(BookBean bean : arr) {
			System.out.println(bean.getNo() +"\t"+ bean.getTitle() +"\t"+ bean.getAuthor() +"\t"+ bean.getPublisher() +"\t"+ bean.getPrice() +"\t"+ bean.getPub_day());
		}
	}
	
	public void update() {
		System.out.print("������ ��ȣ �Է� : ");
		int no = sc.nextInt();
		System.out.print("å���� �Է� : ");
		String title = sc.next();
		System.out.print("���� �Է� : ");
		String author = sc.next(); 
		System.out.print("���ǻ� �Է� : ");
		String publisher = sc.next();
		System.out.print("���� �Է� : ");
		int price = sc.nextInt();
		System.out.print("�Ⱓ��(yyyy/mm/dd �������� �Է��ϼ���.) : ");
		String pub_day = sc.next();
		
		bean = new BookBean(no,title,author,publisher,price,pub_day);
		
		int count = dao.update(bean);
		
		if(count == -1) {
			System.out.println("���� ����");
		}else if(count == 0) {
			System.out.println("������ Data�� �����ϴ�");
		}else {
			System.out.println("���� ����");
		}
	}//update()
	
	public void delete() {
		System.out.print("������ å��ȣ �Է� : ");
		int no = sc.nextInt();
		
		int count = dao.delete(no);
		
		if(count == -1) {
			System.out.println("���� ����");
		}else if(count == 0) {
			System.out.println("������ Data�� �����ϴ�");
		}else {
			System.out.println("���� ����");
		}
	}
	
	public void insert() {
		
		System.out.println("��ȣ�� �������� �Էµ˴ϴ�(����)");
		System.out.print("å���� �Է� : ");
		String title = sc.next();
		System.out.print("���� �Է� : ");
		String author = sc.next();
		System.out.print("���ǻ� �Է� : ");
		String publisher = sc.next();
		System.out.print("���� �Է� : ");
		int price = sc.nextInt();
		System.out.print("�Ⱓ��(yyyy/mm/dd �������� �Է��ϼ���.) : ");
		String pub_day = sc.next();
		
		bean = new BookBean(0,title,author,publisher,price,pub_day);
		
		int count = dao.insert(bean);
		if(count == -1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	
	

	public static void main(String[] args) {
		new BookMain();
	}
}
