class Person {
	String name; //�ν��Ͻ� ���� : �ν��Ͻ��� ����� ����
	int age; //�ν��Ͻ� ����
	double height; //�ν��Ͻ� ���� 
	static String nation; // static ����, Ŭ���� ���� : ���� ��ü���� '����'���� ��������� ��� & ��ü�� �������� �ʰ� ����Ҷ� ���
						  // �ν��Ͻ� ������ ��ü�� ������ ������ �����Ǵµ�, static ������ ��ü�� ������ �ʰ� ������ ���� �� �� �ִ�.
}	


public class Ex05_01_Ŭ���� { //Ŭ������ �����(��) ����(����� ����) �ڷ���(type :ex>int,double,String etc...)
	public static void main(String[] args) {
		
		
		String name = "�¿�";
		int age = 10;
		double height = 123.9;
		
//		new Person(); //��ü(�ν��Ͻ� ����)�� �����.(������ ������ ����� �۾�)
		
//		Person p; //int p(4byte), double p(8byte) , but Person p; ��� ���������� ������ �ٷ� ���� ���� ����.
				  //new Person(); �̶�� ������ ����� ������ �������
		
		Person p = new Person(); // p ����(��������[�������� ���� �� �ִ� ����])�� new Person()���� ������� ������ �ּ�(������)�� ����. 
								 // p�� new Person() ������ ������ ����
		
		System.out.println(p); // new Person() �� �ּ� ���
		p.name = "����";
		p.age = 30;
		p.height = 163.9;
		//p.nation = "���ѹα�";
		Person.nation = "���ѹα�";
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
		//System.out.println(p.nation);
		System.out.println(Person.nation);
		
		System.out.println("-----------");
		
		Person p2 = new Person(); // p2�� ������ ������ �ϴ� ���ο� ���� ����
		p2.name = "���缮";
//		p2.age = 50;
//		p2.height = 192.8; 
//		p2.nation = "���ѹα�";
		
		System.out.println(p2.name);
		System.out.println(p2.age); // 0
		System.out.println(p2.height); // 0.0
		System.out.println(p2.nation); // �������� ����ϴ� static�� ����Ͽ����Ƿ� p2.nation ���� �ʱ�ȭ ���� �ʾƵ� p.nation�� ���� ���� ��µȴ�.

		System.out.println("-----------");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		
	}
}

