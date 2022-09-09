class Person {
	String name;
	int age;
	String addr;
	
	Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void show() {
		System.out.println("Person class 의 show 함수");
	}
	
	void display() {
		System.out.print(name + " " + age + " " + addr + " ");
	}
}//

class Student extends Person{
	int kor;
	int eng;
	
	Student(String name, int age, String addr, int kor, int eng){
		/*
		this.name = name;
		this.age = age;
		this.addr = addr;
		*/
		super(name,age,addr);
		this.kor = kor;
		this.eng = eng;
	}	
	
	void display() { //메서드 overriding(오버라이딩)
		show();
		super.display();
		System.out.println(kor + " " + eng);
	}
}//

class Employee extends Person{
	String company;
	String part;
	
	Employee(String name, int age, String addr, String company, String part){
		/*
		this.name = name;
		this.age = age;
		this.addr = addr;
		*/
		super(name,age,addr);
		this.company = company;
		this.part = part;
	}
	
	void display() { //메서드 overriding(오버라이딩)
		show();
		super.display();
		System.out.println(company + " " + part);
	}
}//

public class Ex06_03_상속 {
	public static void main(String[] args) {
		Person p = new Person("이수근",72,"제주");
		Student s = new Student("현아",12,"인천",88,99);
		Employee e = new Employee("조권",55,"부산","중앙","개발부");
		
		p.display();
		System.out.println();
		s.display();
		e.display();
		
	}
}
