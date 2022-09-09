class Parent{
	private int y = 5; // private 을 쓰면 자식메서드 에서 상속되지 않는다.
	int x = 10;
	
	Parent(){
		System.out.println("Parent 생성자");
	}
	
	Parent(int x){
		System.out.println("Parent(int x) 생성자");
		this.x = 30;
	}
	
	void method() {
		System.out.println("P_x:" + x);
	}
}


class Child extends Parent{
	int x = 20; //멤버 변수
	
	Child(){
		//super(); //부모생성자 호출, 안써줘도 자동으로 들어온다, 자식생성자의 가장 윗자리에 써져있다(안그러면 error발생)
				   //다른 overloading 생성자가 이 자리에 들어오면 super();은 사라진다.(부모 생성자는 하나만 실행된다.)
		super(30); 
		System.out.println("Child 생성자");
	}
	
	void method() {
		int x = 30;
		System.out.println("x:" + x); //지역변수에 x 값이 없으면 멤버변수 x것을 출력
		System.out.println("this.x:" + this.x); // this.x-> 현재 클래스 안의 멤버 변수에 접근
		System.out.println("super.x:" + super.x); // 부모에 대한것에 접근할때 super을 사용
		super.method();
	}
}


class Child1 extends Parent{
	int x = 20;
}


public class Ex06_02_상속 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

		System.out.println();
		
		Child1 c1 = new Child1();
		c1.method(); //P_x:10
		
		System.out.println();
		
//		Parent p = new Parent();
//		p.method();
		
		
	}
}
