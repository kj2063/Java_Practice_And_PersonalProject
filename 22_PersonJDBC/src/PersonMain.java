import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	
	PersonDao pdao = new PersonDao();
	Scanner sc = new Scanner(System.in);
	
	PersonMain(){
		System.out.println("PersonMain()");
		init();
	}//PersonMain()
	
	public void init() {
		while(true) {
			System.out.println("===== �޴� �����ϱ� =====");
			System.out.println("1. ��ü ���� ��ȸ");
			System.out.println("2. ������ ��ȸ");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �߰�");
			System.out.println("6. ���α׷� ����");
			System.out.print(">> �޴� ��ȣ �Է� : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				ArrayList<PersonBean> lists = pdao.getAllPerson();
				showPerson(lists);
				break;
			case 2: 
				findGender();
				break;
			case 3: 
				updateData();
				break;
			case 4: 
				deleteData();
				break;
			case 5: 
				insertData();
				break;
			case 6: System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			default:System.out.println("1~6������ ��ȣ�� �Է� ����");
				
			
			}
		}
	}//init()
	
	public void deleteData() {
		System.out.print("������ ��ȣ �Է�:");
		int num = sc.nextInt();
		pdao.deleteData(num);
	}
	
	public void updateData() {
		System.out.print("������ ��ȣ �Է�:");
		int num = sc.nextInt();
		System.out.print("�̸� �Է�:");
		String name = sc.next();
		System.out.print("���� �Է�:");
		int age = sc.nextInt();
		System.out.print("���� �Է�:");
		String gender = sc.next();
		System.out.print("���� �Է�:");
		String birth = sc.next();
		
		PersonBean bean = new PersonBean(num,name,age,gender,birth);
		pdao.updateData(bean);
	}
	
	public void insertData() {
		System.out.println("��ȣ�� �������� �ڵ��Էµ˴ϴ�.(����)");
		System.out.print("�̸� �Է�:");
		String name = sc.next();
		System.out.print("���� �Է�:");
		int age = sc.nextInt();
		System.out.print("���� �Է�:");
		String gender = sc.next();
		System.out.print("���� �Է�:");
		String birth = sc.next();
		
		PersonBean bean = new PersonBean(0,name,age,gender,birth);
		pdao.insertData(bean);
	}
	
	public void findGender() {
		System.out.print("ã������ ���� �Է� : ");
		String gender = sc.next();
		 ArrayList<PersonBean> lists = pdao.findGender(gender);
		showPerson(lists);
	}
	
	public void showPerson(ArrayList<PersonBean> lists) {
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		
		for(PersonBean a : lists) {
			System.out.println(a.getNum() + "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getGender() + "\t" + a.getBirth());
		}
		
//		for(int i=0; i<lists.size(); i++) {
//			PersonBean comp = lists.get(i);
//			System.out.println(comp.getNum() + "\t" + comp.getName() + "\t" + comp.getAge() + "\t" + comp.getGender() + "\t" + comp.getBirth());
//		}
	}
	
	public static void main(String[] args) {
		new PersonMain();
	}
}
