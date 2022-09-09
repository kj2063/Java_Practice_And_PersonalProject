class Parent{
	private int y = 5; // private �� ���� �ڽĸ޼��� ���� ��ӵ��� �ʴ´�.
	int x = 10;
	
	Parent(){
		System.out.println("Parent ������");
	}
	
	Parent(int x){
		System.out.println("Parent(int x) ������");
		this.x = 30;
	}
	
	void method() {
		System.out.println("P_x:" + x);
	}
}


class Child extends Parent{
	int x = 20; //��� ����
	
	Child(){
		//super(); //�θ������ ȣ��, �Ƚ��൵ �ڵ����� ���´�, �ڽĻ������� ���� ���ڸ��� �����ִ�(�ȱ׷��� error�߻�)
				   //�ٸ� overloading �����ڰ� �� �ڸ��� ������ super();�� �������.(�θ� �����ڴ� �ϳ��� ����ȴ�.)
		super(30); 
		System.out.println("Child ������");
	}
	
	void method() {
		int x = 30;
		System.out.println("x:" + x); //���������� x ���� ������ ������� x���� ���
		System.out.println("this.x:" + this.x); // this.x-> ���� Ŭ���� ���� ��� ������ ����
		System.out.println("super.x:" + super.x); // �θ� ���ѰͿ� �����Ҷ� super�� ���
		super.method();
	}
}


class Child1 extends Parent{
	int x = 20;
}


public class Ex06_02_��� {
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
