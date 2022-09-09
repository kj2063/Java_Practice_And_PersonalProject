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
	private String part;//부서
	
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
//	private String name; //아이유
//	private int age;//30
//	private String company;// 중앙고등학교
//	private String part;//부서//생활지도부
	private String subject;//음악

	Teacher(String name,int age, String company, String part, String subject){
		super(name,age,company,part);
		this.subject = subject;
	}
	
	void display() {
		super.display();
		System.out.print(subject);
	}

}

public class Ex06_05_권준 {
	public static void main(String[] args) {
		

		Human h = new Human("아이유",30);//	클래스별 객체 3개 생성
		Worker w = new Worker("아이유",30,"중앙고","생활지도부");//	생성자 주입
		Teacher t = new Teacher("아이유",30,"중앙고","생활지도부","음악");
		
		h.display();//	객체 3개 모두 출력
		System.out.println();
		w.display();
		System.out.println();
		t.display();
		
	}
}
