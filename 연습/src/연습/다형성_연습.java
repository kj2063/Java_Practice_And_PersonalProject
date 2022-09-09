package 연습;

class A{

	public void a(){
		System.out.println("A_a");
	}
}

class B extends A{

	public void a(){
		System.out.println("B_a");
	}
}

public class 다형성_연습 {
	public static void main(String[] args) {
		A aa = new A();
		aa.a(); //A_a 
		
		A bb = new B();
		bb.a(); //B_a // new B를 해서 A type으로 받았을 했을때만 extend로 overriding한 값으로 변경된다.
	}
}
