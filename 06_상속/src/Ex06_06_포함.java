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
	Person2 p; //Person2의 객체를 관리하는 p를 멤버변수로 갖을 수 있다 : 포함
	
	Student2(String name, int age, int kor, int eng){
		this.kor = kor;
		this.eng = eng;
		//p = new Person2(name, age);
		p = new Person2(name);
		this.p.age = age;// this. 은 써도 되고 안써도 됨	
	}
	
	void display() {
		System.out.println("이름:" +p.getName());//private 는 getter 작성하여 호출
		System.out.println("나이:" +p.age);
		System.out.println("국어점수:" +kor);
		System.out.println("영어점수:" +eng);
	}	
}		
		
		
		
public class Ex06_06_포함 {
	public static void main(String[] args) {
		
		Student2 s = new Student2("연아",30,88,99);
		
		s.display();
	}
}
