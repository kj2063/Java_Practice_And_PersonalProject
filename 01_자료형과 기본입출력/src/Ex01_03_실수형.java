
public class Ex01_03_�Ǽ��� {
	public static void main(String[] args) {
		System.out.println("===�Ǽ��� �ڷ���===");
		
//		float : 4byte
//		double : 8byte
				
		//float ft1 = 1.234;//1.234�� �ڵ����� 8byte(double) �� ������ error �߻�
		float ft1 = 1.234f;
		System.out.println("ft1:" + ft1);
		
		float ft2 = 0.0987000f;
		System.out.println("ft2:" + ft2); // ���� ������ �ǹ̾��� 000�� ������ �ʴ´�

		float ft3 = 1.1234567890123456f;
		System.out.println("ft3:" + ft3); // �Ҽ��� 7° �ڸ����� ���´�. 8��° �ڸ��� �ݿø��ȴ�.
		
		
		double d1 = 1.234;
		System.out.println("d1:" + d1);
		
		double d2 = 1.1234567890123456789f;
		System.out.println("d2:" + d2); // �Ҽ��� 16° �ڸ����� ���´�. 17��° �ڸ��� �ݿø��ȴ�.
		
		d2 = ft1;
		//ft1 = d2; //��������(float)�� ū����(double) ���� �� ����. type mismatch
		ft1 = (float)d2;
		System.out.println("ft1:" + ft1);
		
		double d3 = .987e-2; // 0.987 * 10^-2
		System.out.println("d3:" + d3);
//----------------------------
		
		int i = 10;
		float f = 1.2f;
		
		f = i;
		System.out.println("f:" + f);

		//i = f; //���� byte�� �����ϴ� type�� ������ �Ǽ��� ������ �������� �� ũ��. ���� �������������� �Ǽ��� ���������� ���� ���Ѵ�.
		//type mismatch
		i = (int)f;//��������ȯ �ϸ� ���� �� �ִ�.
		System.out.println("i:" + i);

	}	
}
