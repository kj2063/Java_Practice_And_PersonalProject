class Person2{
	private String name;
	int age;
	
	Person2(){}
	
	Person2(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

class Student2 extends Person2{
//	String name;
//	int age;
	int kor,eng;
	Person2 p; //Person2�� ��ü�� �����ϴ� p�� ��������� ���� �� �ִ� : ����
	
	Student2(String name, int age, int kor, int eng){
		this.kor = kor;
		this.eng = eng;
		//p = new Person2(name, age);
		p = new Person2(name);
		this.p.age = age;// this. �� �ᵵ �ǰ� �Ƚᵵ ��	
	}
	
	void display() {
		System.out.println("�̸�:" +p.getName());//private �� getter �ۼ��Ͽ� ȣ��
		System.out.println("����:" +p.age);
		System.out.println("��������:" +kor);
		System.out.println("��������:" +eng);
	}	
}		
		
		
		
public class Ex06_06_���� {
	public static void main(String[] args) {
		
		Student2 s = new Student2("����",30,88,99);
		
		s.display();
	}
}
