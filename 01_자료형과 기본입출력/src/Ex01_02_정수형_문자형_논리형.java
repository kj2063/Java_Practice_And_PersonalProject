
public class Ex01_02_������_������_���� {
	public static void main(String[] args) {
		System.out.println("===������ �ڷ���===");
		System.out.println(10+20);
		/*
		  �ڷ��� :
		  	 byte : 1byte ���� -128~128
		  	 short : 2byte ���� -32,768~32,768
		  	 int : 4byte ���� -21��~21��
			 long : 8byte ���� -900��~900�� 		 
		*/
		// int ���� ���� byte�� short�� ����
		
		
		int a,b; //�뵵 ���� => '����'
		a = 1000; // a cannot be resolved to a variable(����==����)
		b = 2000; //���� ���ڿ� ���� �ִ°� => '�ʱ�ȭ'
		a = 7;
		
		int c = 500; //���� + �ʱ�ȭ
		
		System.out.println("a+b");
		System.out.println(a+b);
		System.out.println("a+b=" + (a+b));

//-------------------------------		
		byte b1 = 10;
		byte b2 = 20;
		//System.out.println();  => 'syso' + ctrl + space
		System.out.println("b1+b2=" + (b1+b2));
		
		int b3 = b1 + b2;// int ���� ���� type�� ������ int type(long����)�� �ȴ�.
		
//-------------------------------		
		byte b10 = 1;
		short s10 = 2;
		int i10;
		long l10;
		
		//b10 = s10; // ū type �ȿ� ����type ���� ���� �� ������ �ݴ�� �ȵȴ�.(type mismatch)
		b10 = (byte)s10; // ������ ūŸ���� ���� Ÿ������ ���� ��ȯ�Ͽ� ���� �� �ִ�.(��������ȯ)
		System.out.println("b10:" + b10);
		
		int x = 1000000;
		int y = 2000000;
		
		int z = x*y;
		System.out.println("int_z:" + z); // -1454759936
		
		long z2 = x*y;
		System.out.println("long_z:" + z2); //2���� long �ȿ� ������ int���� �����Ͱ� ���� ����� ���´�.
										   //x(4byte)�� y(4byte)�� ��� ������� 4byte(int��)�� �־����µ� long(8byte)�� �־���� 4byte ��� ���̹Ƿ� �׷���. 
		long z3 = (long)x*y;
		System.out.println("z:" + z3); //x���̳� y���� long������ ��������ȯ �� ����ϸ� long type�� ������ ����� ���´�.
		
//--------------------------------
		System.out.println("===������ �ڷ���===");
		
		char ch1 = 'A';
		char ch2 = 'B';
		/*
		 �ƽ�Ű �ڵ尪
		 A : 65
		 B : 66
		 
		 a : 97
		 b : 98
		 ! : ~
		 @ : ~
		 (����) : ~
		 
		 0 : 48  **�߿�
		 1 : 49
		 */
		
		
		System.out.println("ch1:" +ch1);
		System.out.println("ch2:" +ch2);
		
		int ch3 = ch1 + ch2; // 'A'(2byte) + 'B'(2byte) => int�� (4byte ���� ���� �͵��� ����ϸ� int���� �ȴ�)
		System.out.println("ch3:" + ch3);//ch3:131 
		
		System.out.println(ch1 + 1); // 'A'(2byte) + 1(4byte �� ������ ����)
		System.out.println( (char)(ch1 + 1) );// (char)66
		System.out.println( (char)ch1 + 1 );// (char)'A'(������ �����ε� char�� �ٲ㵵 �ǹ� ����) + 1
		
		//char ch4 = "apple"; // char�� '' ���� �ѱ��ڸ� ���� �� �ִ�.
		String ch4 = "apple";

//-------------------------------
		System.out.println("===���� �ڷ���===");
		boolean bool1 = true;// boolean �� type �� �������� true �ƴϸ� false �� ��� �� �ִ�.
		boolean bool2 = false;
		
		bool1 = 5 > 10; // ==false
		System.out.println("bool1 : "+ bool1);
		
		
	}
}
