public class Ex01_01_println {
	public static void main(String[] args) {
		System.out.println("�ڹ� ù��° ����");
		System.out.println("1+2");
		
		//System.out.println('1+2');
		System.out.println("A");
		System.out.println('B'); //''�ȿ��� �ѱ��ڸ� �� �� �ִ�.
		
		// �ּ���:����X, ����
		System.out.println("������ " + "��ſ� " + "ȭ���� �Դϴ�.");
		System.out.println(1+2);
		System.out.println("1+2=" + 1+2 ); //���ڿ� �ڿ� ������ + �� �� ����  => �켱������ ���̰� ������ ��ȣ�� ����
		System.out.println("1+2=" + (1+2) );
		System.out.println(1+2 + "1+2=\n\n" ); //���� �� ���ڿ��� ������ ����
//--------------------------------
		
		//���Ĺ��� : %d %c %f %s
		int a = 12; // %d : ���ڸ��� '����'����ҰŴ�
		char b = 'B';// %c : '����'
		float c = 72.346f;// %f
		String d = "������";// %s
		
		System.out.println("a=" + a + "�Դϴ�"); // a=12�Դϴ�
		System.out.printf("a=%d�Դϴ�\n",a);//printf(print_format) �� �ٲ� �����ϰ� ����Ϸ��� ������ ���� �ϸ� �ȴ�. 

		System.out.printf("b=%c�Դϴ�\n",b);//b=B�Դϴ�
		//System.out.printf("b=%d�Դϴ�",b);
		System.out.printf("b=%d�Դϴ�\n\n",(int)b);//b=66�Դϴ�

		
		System.out.printf("c=%f�Դϴ�\n",c);//c=72.346001�Դϴ� //��ǻ�Ͱ� �Ǽ� ó���� �Ϻ��ϰ� ���Ͽ� �ణ�� ������ ���� �� �ִ�.
		System.out.printf("c=%.2f�Դϴ�\n",c);//%.2f �Ҽ��� 2�ڸ������� ������ �ض�. 3��° �ڸ��� �ݿø��Ѵ�.
		System.out.printf("c=%8.2f�Դϴ�\n\n",c);//8�ڸ��� ��� ����ϵ� �Ҽ��� 2�ڸ������� ������ �ض�(���ڸ��� �������� ��Ÿ����)

		System.out.println("���� �̸��� " +d+ "�Դϴ�");//���� �̸��� ������ �Դϴ�
		System.out.printf("���� �̸��� %s �Դϴ�\n\n",d);
		
		/*
		\\ -> \�� print �ϰ������ 
		\t -> tapŰ�� ������ ��ŭ ����
		\" -> ���� ����ǥ(')�� �׳� �ᵵ �Ǵµ� "�� print �ϰ������
		*/ 
		System.out.println("�ȳ�\\�ϼ���!\t���� '�̸�'�� \"ȫ�浿\" �Դϴ�.");
		
	}
}
