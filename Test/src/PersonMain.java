import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	
	PersonDao pdao = new PersonDao();
	Scanner sc = new Scanner(System.in);
	
	PersonMain(){
		System.out.println("PersonMain()");
		init();
	}
	
	public void init() {
		//System.out.println("init");
		
		while(true) {
			System.out.println("=====�޴� �����ϱ�=====");
			System.out.println("1.��ü ���� ��ȸ");
			System.out.println("2.������ ��ȸ");
			System.out.println("3.���� ����");
			System.out.println("4.���� ����");
			System.out.println("5.���� �߰�");
			System.out.println("6.���α׷� ����");
			System.out.print(">> �޴� ��ȣ �Է� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ArrayList<PersonBean> lists = pdao.getAllPerson(); 
				showPerson(lists);
				break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6: System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			default:System.out.println("1~6������ ��ȣ�� �Է� ����");		
				
			}
		}
		
	}// init
	
	public void showPerson(ArrayList<PersonBean> lists){
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		for( int i=0;i<lists.size();i++) {
			PersonBean pb = lists.get(i);
			String result = pb.getNum()+"\t"+
							pb.getName()+"\t"+
							pb.getAge()+"\t"+
							pb.getGender()+"\t"+
							pb.getBirth();
			System.out.println(result);
			
//			for(PersonBean pb:lists) {
//				System.out.println(pb.getNum()+"\t"+pb.getName()+"\t"+pb.getAge()+"\t"+pb.getGender()+"\t"+pb.getbirth());
//			}

			
		}
	}//showPerson
	
	public static void main(String[] args) {
		new PersonMain();
	}
}
