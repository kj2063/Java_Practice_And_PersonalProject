import java.util.Scanner;

public class Ex02_01_��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int num1, num2;
		
		System.out.print("num1�� ���� �Է�:");
		int num1 = sc.nextInt();
		
		
		System.out.print("num2�� ���� �Է�:");
		int num2 = sc.nextInt();
		
		
		//System.out.println(num1 + "+" + num2 + "=" + (num1+num2)); //20+3=23
		System.out.printf("%d+%d=%d\n",num1,num2,(num1+num2));
		
		//System.out.println(num1 + "-" + num2 + "=" + (num1-num2)); //20-3=17
		System.out.printf("%d-%d=%d\n",num1,num2,(num1-num2));
		
		//System.out.println(num1 + "*" + num2 + "=" + (num1*num2)); //20*3=60
		System.out.printf("%d*%d=%d\n",num1,num2,(num1*num2));
		
		//System.out.println(num1 + "/" + num2 + "=" + (num1/num2)); //20/3=6
		System.out.printf("%d/%d=%d\n",num1,num2,(num1/num2));
		
		//System.out.printf(num1 + "/" + num2 + "=%.2f\n",(num1/(double)num2)); //20/3=6.67
		System.out.printf("%d/%d=%.2f\n",num1,num2,(num1/(double)num2));
		
		//System.out.println(num1 + "%" + num2 + "=" + (num1%num2)); //������ ��� 20%3=2
		System.out.printf("%d%%%d=%d\n",num1,num2,(num1%num2)); // �̷��� �������� ǥ���Ҷ� �߰��� %�� ��Ÿ���� ���ؼ� %%�� ����Ѵ�
	}
}
