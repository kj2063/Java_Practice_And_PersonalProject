
public class Ex05_03_�޼��� { // �޼��� : Ư���� �۾��� ���������� �����ϵ��� �ϰ� �ϴ°�. �ʿ��� �� ���� ȣ���ؼ� ���.
	public static void main(String[] args) {// main �޼���� �ڵ��� ��� ��ġ�� �ִ� ���� ���� ����ȴ�.
		
		int sum;
		
		//sum = 1+2;
		sum = add(1,2); // add �޼��� ȣ��
		System.out.println("sum : " + sum);
		
		//sum = 11+23;
		sum = add(11,23);
		System.out.println("sum : " + sum);
		
		//sum = 546+232;
		sum = add(546,232);
		System.out.println("sum : " + sum);
		
		/*
		3.1, 2, 1
		128.4, 8, 15 �� �� ȣ���غ���
		*/
		System.out.println();
		
		subtract(3.1,2,1);
		subtract(128.4,8,15);
		
		System.out.println();
		
		mul();
		
	} //main
	
	static int add(int a, int b) { //add �޼��� ����  //a, b : �Ű�����
		int c = a+b;
		return c;
	}
	
	/*
	static double subtract(double a, int b, int c) {
		double d = a-b-c;
		return d;
	}
	*/
	 
	// ������ ���� ������ �޼��带 ���� �� �� �ִ�. 
	static void subtract(double a, int b, int c) {
		double d = a-b-c;
	 	System.out.println("d : " + d);
	 	//return; -> ���� �� ���� ������ retrun; �̶�� ������ �ƹ����� ���� �ʾƵ� �ȴ�.
	}
	
	static void mul(){
		System.out.println(3*4);
	}
	
}

/*
����Ÿ�� �޼����̸�(Ÿ�� ������, Ÿ�� ������, ...) { //�����
	�޼��� ȣ��� ����� �ڵ�
}
*/
