
public class Ex05_12_overloading { //�ϳ��� �޼��� �̸����� �������� �޼��带 ���� �� �ְ� ���ִ� ���
	public static void main(String[] args) {
		
		int x = plus(3,5,7);
		System.out.println("x:" + x);
		
		float y = plus(0.12f,0.34f);
		System.out.println("y:" + y);
		
		double z = plus(0.01, 0.02, 0.03);
		System.out.println("z:" +z);
	}	
		
	static int plus(int a,int b,int c) {
		return a + b + c;
	}	
		
	static float plus(float a , float b) {
		return a + b;
	}	

	static double plus(double a , double b, double c) {
		return a + b + c;
	}	
	
	
}	
/*
�޼��� �����ε�(overloading)
- �޼��� �̸��� ���ƾ� �Ѵ�
- �Ű������� ������ �ڷ���(Ÿ��)�� �޶�� �Ѵ�

�������̵�(overriding) <==> �����ε�(overloading) //�ΰ����� ���� �� �� �־�� ��
*/