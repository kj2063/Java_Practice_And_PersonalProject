package ����;
	
class Calculator_class{
	
	static double pi =3.14159; //static(����) �� ��ü�� �������� �ʰ� ��� �� �� �ְ� ���ش�.
							   // Calculator(Ŭ����).~(����or�޼ҵ�) �� ��ü ���� ���� �ٷ� ���.
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
}

public class p238_���������� {
	public static void main(String[] args) {
		
		Calculator_class cal = new Calculator_class();
		//p238_Calculator = new p238_Calculator();
		System.out.println(cal.pi); //static(����) �޼ҵ�� ��Ģ������ Ŭ���� �̸����� �����ؾ������� -> p238_Calculator.pi 
									//������ ���� ��ü ���� �����ε� ������ �����ϴ�.
									// �ٵ� ���� ���� �߻�. ��? => Calculator��� Ŭ������ ����� ������ calculator Ŭ������
									// �浹�� �ִµ�....? Calculator_class ��� Ŭ���� ������ �ٲ������ ��������.
									// or �ٸ� ��Ű���� �ִ� Calculator �� �浹�� �ִµ�.
		
		System.out.println(Calculator_class.pi);
		System.out.println(p238_Calculator.pi);
		//System.out.println(p238_Calculator.pi);
		
		System.out.println();
		
		Calculator_class.pi = 3.14; //������ ���� �ʱ�ȭ �� �� �ִ�.
		System.out.println(Calculator_class.pi);
		
	} 
}


