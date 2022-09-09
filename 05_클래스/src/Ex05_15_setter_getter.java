class Person2 { //���� ������Ʈ �ȿ� ���� �̸��� Ŭ���� 2�� �̻� �������.
	private String name; //�ν��Ͻ� ���� : �ν��Ͻ��� ����� ����
	private int age; //�ν��Ͻ� ����
	private double height; //�ν��Ͻ� ���� 
	
	//setter: ���� setting �ϴ� �޼���
	void setName(String name) {
		this.name = name;//�Ű������� �ν��Ͻ� �����̸��� ������, ���������� ���� name �� ������� name(this.name)���� �־��
	}
	void setAge(int age) {
		if (age>0)
			this.age = age;
	}
	void setHeight(double height) {
		this.height = height;
	}
	
	//getter: ������ �������� �޼���
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	double getHeight() {
		return height;
	}

}	

public class Ex05_15_setter_getter {
	public static void main(String[] args) {
		
		Person p = new Person(); //Ex05_01_Ŭ���� ���Ͽ� Person class ���ǵ�. =>���� ������Ʈ �ȿ� ����
		Person2 p1 = new Person2();
//		p1.name = "�̹���"; //error message 'not visible' �� private�� �س��� �׷���.
//		p1.age = 59;
//		p1.height = 178.2;
//		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
		
		p1.setName("�̹���");
		p1.setAge(-59);
		System.out.println(p1.getAge()); // �ν��Ͻ� ������ ���� input ���� ������ �ڵ����� 0���� �ʱ�ȭ �ȴ�.
		
		p1.setAge(59);
		p1.setHeight(178.2);
		
		System.out.println();
		
		System.out.print("name = " + p1.getName() + "\n");
		System.out.print("age = " + p1.getAge() + "\n");
		System.out.print("height = " + p1.getHeight() + "\n");	
		
	}
	
}
