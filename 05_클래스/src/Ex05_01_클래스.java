class Person {
	String name; //인스턴스 변수 : 인스턴스를 만들면 생성
	int age; //인스턴스 변수
	double height; //인스턴스 변수 
	static String nation; // static 변수, 클래스 변수 : 여러 객체에서 '공통'으로 쓰고싶을때 사용 & 객체를 생성하지 않고 사용할때 사용
						  // 인스턴스 변수는 객체를 만들어야 공간이 생성되는데, static 변수는 객체를 만들지 않고도 공간을 생성 할 수 있다.
}	


public class Ex05_01_클래스 { //클래스는 사용자(가) 정의(만들어 쓰는) 자료형(type :ex>int,double,String etc...)
	public static void main(String[] args) {
		
		
		String name = "태연";
		int age = 10;
		double height = 123.9;
		
//		new Person(); //객체(인스턴스 생성)를 만든다.(데이터 공간을 만드는 작업)
		
//		Person p; //int p(4byte), double p(8byte) , but Person p; 라고 선언했을때 공간이 바로 형성 되지 않음.
				  //new Person(); 이라는 선언을 해줘야 공간이 만들어짐
		
		Person p = new Person(); // p 변수(참조변수[참조값을 넣을 수 있는 변수])에 new Person()으로 만들어진 공간의 주소(참조값)가 들어간다. 
								 // p는 new Person() 공간의 관리자 변수
		
		System.out.println(p); // new Person() 의 주소 출력
		p.name = "윤아";
		p.age = 30;
		p.height = 163.9;
		//p.nation = "대한민국";
		Person.nation = "대한민국";
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
		//System.out.println(p.nation);
		System.out.println(Person.nation);
		
		System.out.println("-----------");
		
		Person p2 = new Person(); // p2를 관리자 변수로 하는 새로운 공간 생성
		p2.name = "유재석";
//		p2.age = 50;
//		p2.height = 192.8; 
//		p2.nation = "대한민국";
		
		System.out.println(p2.name);
		System.out.println(p2.age); // 0
		System.out.println(p2.height); // 0.0
		System.out.println(p2.nation); // 공통으로 사용하는 static을 사용하였으므로 p2.nation 값을 초기화 하지 않아도 p.nation에 넣은 값이 출력된다.

		System.out.println("-----------");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		
	}
}

