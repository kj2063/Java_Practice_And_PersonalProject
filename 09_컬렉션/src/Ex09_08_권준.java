import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}


public class Ex09_08_���� {
	
	static ArrayList<Card> cards = new ArrayList<Card>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		
		
		while(true) {
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			System.out.print("��ȣ �Է� :");
			num = sc.nextInt();
			
			
			
			if(num == 1) {
				m1();
			}
			else if(num ==2) {
				m2();
			}
			else if(num ==3) {
				m3();
			}
			else if(num ==4) {
				m4();
			}
			else if(num ==5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
							
		}//while
				
		
		
	}//main
	
	static void m1() {
		System.out.print("�̸��� �Է��ϼ��� :");
		String name = sc.next();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� :");
		String pnum = sc.next();
		
		cards.add(new Card(name,pnum));
		System.out.println();
	}
	
	static void m2() {
		int i;
		boolean retry = false;
		System.out.print("�̸��� �Է��ϼ��� :");
		String name = sc.next();
		
		for(i=0; i<cards.size(); i++) {
			if(cards.get(i).getName().equals(name)) {
				retry = true;
				break;
			}
		}
		if(retry == false) {
			System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�");
			System.out.println();
			return;
		}
		else {
			cards.remove(i);
			System.out.println("���� �Ǿ����ϴ�");
		}
		System.out.println();
		
	}
	
	static void m3() {
		int i;
		boolean retry = false;
		System.out.print("�̸��� �Է��ϼ��� :");
		String name = sc.next();
		
		for(i=0; i<cards.size(); i++) {
			if(cards.get(i).getName().equals(name)) {
				retry = true;
				break;
			}
		}
		if(retry == false) {
			System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�");
			System.out.println();
			return;
		}
		
		System.out.print("�����Ͻ� ��ȣ�� :");
		String pnum_re = sc.next();
		cards.get(i).setTel(pnum_re);
		System.out.println("�����Ǿ����ϴ�");
		System.out.println();
	}
		
	static void m4() {
		System.out.println("�̸�\t\t��ȭ��ȣ");
		for(int i=0; i<cards.size(); i++) {
			System.out.println(cards.get(i).getName() + "\t\t" + cards.get(i).getTel());
		}
		System.out.println();
	}
	
}
