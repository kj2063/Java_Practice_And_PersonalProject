class Calculator { // class�� 2���� ���� : 1.���ο� �ڷ��� ���� , 2. ���� Ŭ����
	int x;
	int y;
		
	int sum(int a,int b) {
		return a+b;
	}
		
	int max(int x, int y){
		if(x>y) 
			return x;
		else
			return y;
	}
		
}
		
public class Ex05_04_�޼��� { //main �޼��带 �����ִ� Ŭ���� -> ����Ŭ����
	public static void main(String[] args) {
		
		//x�� y�� 10�� 20 �ְ� ����غ���		
		Calculator c = new Calculator();
		c.x = 10;
		c.y = 20;
		
		System.out.printf("x=%d  y=%d",c.x,c.y);
		System.out.println("\nsum = " + c.sum(c.x,c.y));
		System.out.println("111 �� 222 �� ū ����? : "+ c.max(111,222));
		
		System.out.println();
		
		Ex05_04_�޼��� ex = new Ex05_04_�޼���();
		ex.prn();
		
		show();
	} // main
	
	void prn(){ //����Ÿ���� �� �־�� �Ѵ�. return�� ���ٰ� ����Ÿ���� �Ⱦ��� �ȵȴ�.
		System.out.println("�޼��� ������~");
	}
	
	static void show() {
		System.out.println("show() ���� ");
	}

}// Ex05~


