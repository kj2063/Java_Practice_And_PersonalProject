class Human{
	private String name;
	private int age;

	Human(String name, int age ){
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.print(name + " " + age + " ");
	}
}

class Worker extends Human{
//	private String name;
//	private int age;
	private String company;
	private String part;//�μ�
	
	Worker(String name, int age, String company, String part){
		super(name,age);
		this.company = company;
		this.part = part;
	}
	
	void display() {
		super.display();
		System.out.print(company + " " + part + " " );
	}
}

class Teacher extends Worker{
//	private String name; //������
//	private int age;//30
//	private String company;// �߾Ӱ���б�
//	private String part;//�μ�//��Ȱ������
	private String subject;//����

	Teacher(String name,int age, String company, String part, String subject){
		super(name,age,company,part);
		this.subject = subject;
	}
	
	void display() {
		super.display();
		System.out.print(subject);
	}

}

public class Ex06_05_���� {
	public static void main(String[] args) {
		

		Human h = new Human("������",30);//	Ŭ������ ��ü 3�� ����
		Worker w = new Worker("������",30,"�߾Ӱ�","��Ȱ������");//	������ ����
		Teacher t = new Teacher("������",30,"�߾Ӱ�","��Ȱ������","����");
		
		h.display();//	��ü 3�� ��� ���
		System.out.println();
		w.display();
		System.out.println();
		t.display();
		
	}
}
