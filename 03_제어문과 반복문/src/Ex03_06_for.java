import java.util.Scanner;

public class Ex03_06_for {
	public static void main(String[] args) {

		/*
		for(�ʱ��;���ǽ�;������) { 
			�ݺ��� ����1;
			�ݺ��� ����2; 
		}
		 */

		int i;
		//System.out.println("�ڹ� ������"); * 5
		for (i=1; i<=5; i++) {
			System.out.println("�ڹ� ������ for: " + i);
		}

		System.out.println("for�� ��: " + i);

		//54321
		for (i=5; i>=1; i--) { // i-- ��� i=i-1 or i-=1 �� �ȴ�.
			System.out.println("for�� ������: " + i);
		}

		
		System.out.println("-------------------");

		
		for (i=2;i<=10;i=i+2) {
			System.out.println("������ �����:" + i);
		}

		
		System.out.println("--------------------");

		
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("sum:" + sum);

		sum = 0;
		for (i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);

		
		System.out.println("---------------------");

		
		//1~100������ �� ���ϱ�
		int sum1 = 0; //¦���϶��� ��
		int sum2 = 0; //Ȧ���϶��� ��

		for(i=1;i<=100;i++) {
			if(i%2==0)
				sum1 += i;
			else
				sum2 += i;
		}

		System.out.println("1~100 ������ �� �� ¦���� ��: " + sum1);
		System.out.println("1~100 ������ �� �� Ȧ���� ��: " + sum2);

		//1~100������ ���� 5�� ��� �̸鼭 7�� ����� ��
		sum = 0;
		for(i=1;i<=100;i++)
			if (i%7==0) // if���� �ι� ������� �ʰ� if(i%7==0 && i%5==0) �� ����ص� ����. 
				if(i%5==0) {
					sum += i;
					System.out.println(i);
				}	
		System.out.println("1~100������ ���� 5 and 7�� ����� ���� ��: " + sum);

		
		System.out.println("------------------");


		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�:");
		int num = sc.nextInt();

		for(i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",num,i,(num*i));
		}
		
		

	}	
}
