package Video;

public class Main {
	
	static VideoShop vs = new VideoShop();
	
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		Person p1 = new Person("����");
		Person p2 = new Person("����");
		Person p3 = new Person("RM");
		Person p4 = new Person("����");
		
//		String s = p1.getName(); //Person �� getName() �޼��尡 ������ Thread�� ���� ��ӵ� getName()�� ��µȴ�. ��°��� �������� �̸��̴�.
//		System.out.println(s);
//		System.out.println(p2.getName());
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		
		System.out.println("���α׷� ��");
	}

}
