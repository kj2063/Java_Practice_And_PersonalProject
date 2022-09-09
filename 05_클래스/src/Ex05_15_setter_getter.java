class Person2 { //같은 프로젝트 안에 같은 이름의 클래스 2개 이상 못만든다.
	private String name; //인스턴스 변수 : 인스턴스를 만들면 생성
	private int age; //인스턴스 변수
	private double height; //인스턴스 변수 
	
	//setter: 변수 setting 하는 메서드
	void setName(String name) {
		this.name = name;//매개변수와 인스턴스 변수이름이 같을때, 지역변수로 받은 name 을 멤버변수 name(this.name)에다 넣어라
	}
	void setAge(int age) {
		if (age>0)
			this.age = age;
	}
	void setHeight(double height) {
		this.height = height;
	}
	
	//getter: 변수를 가져오는 메서드
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
		
		Person p = new Person(); //Ex05_01_클래스 파일에 Person class 정의됨. =>같은 프로젝트 안에 있음
		Person2 p1 = new Person2();
//		p1.name = "이무진"; //error message 'not visible' 은 private로 해놔서 그렇다.
//		p1.age = 59;
//		p1.height = 178.2;
//		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
		
		p1.setName("이무진");
		p1.setAge(-59);
		System.out.println(p1.getAge()); // 인스턴스 변수는 값을 input 하지 않으면 자동으로 0으로 초기화 된다.
		
		p1.setAge(59);
		p1.setHeight(178.2);
		
		System.out.println();
		
		System.out.print("name = " + p1.getName() + "\n");
		System.out.print("age = " + p1.getAge() + "\n");
		System.out.print("height = " + p1.getHeight() + "\n");	
		
	}
	
}
