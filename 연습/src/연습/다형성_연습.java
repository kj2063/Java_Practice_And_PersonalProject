package ����;

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

public class ������_���� {
	public static void main(String[] args) {
		A aa = new A();
		aa.a(); //A_a 
		
		A bb = new B();
		bb.a(); //B_a // new B�� �ؼ� A type���� �޾��� �������� extend�� overriding�� ������ ����ȴ�.
	}
}
