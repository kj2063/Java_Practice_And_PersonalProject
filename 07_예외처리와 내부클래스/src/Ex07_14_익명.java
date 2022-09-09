class Test{
	int x=2;
	void display() {
		System.out.println("Test x:" + x);
	}
	
}

class Test2 extends Test{
	void display() {
		System.out.println("Test2 x*x:"+ x*x);
	}
}


public class Ex07_14_익명 {
	public static void main(String[] args) {
		
		Test t = new Test();
		t.display();
		
		Test t2 = new Test2();
		t2.display();
		
		//익명클래스 :특정 클래스를 상속받아 특정 메소드를 오버 라이딩 한 후, 딱 한번만 호출할 것이다 할때 사용
		new Test() {
			//@overriding
			void display() {
				System.out.println(x*x*x);
			}
		}.display();
		
		
	}
}
