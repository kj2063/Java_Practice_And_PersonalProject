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


public class Ex07_14_�͸� {
	public static void main(String[] args) {
		
		Test t = new Test();
		t.display();
		
		Test t2 = new Test2();
		t2.display();
		
		//�͸�Ŭ���� :Ư�� Ŭ������ ��ӹ޾� Ư�� �޼ҵ带 ���� ���̵� �� ��, �� �ѹ��� ȣ���� ���̴� �Ҷ� ���
		new Test() {
			//@overriding
			void display() {
				System.out.println(x*x*x);
			}
		}.display();
		
		
	}
}
