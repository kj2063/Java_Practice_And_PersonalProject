import java.util.Scanner;
	
public class Ex05_11_���� { //���ȣ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1: ");//�Է�
		int num1 = sc.nextInt();
		System.out.print("����2: ");//�Է�
		int num2 = sc.nextInt();
		
		System.out.printf("%d^%d = %d",num1,num2,mul_method(num1,num2));
		//2 �� 4�� �ԷµȰ�� 2�� 4�� ���ϱ�
	}
	
	static int mul_method(int a,int b) {
		if(b==1)
			return a;
		else
			return a*mul_method(a,--b);
	}
	
}	
