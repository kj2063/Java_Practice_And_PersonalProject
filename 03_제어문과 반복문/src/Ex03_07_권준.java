import java.util.Scanner;

public class Ex03_07_���� {
	public static void main(String[] args) {
		
		//1. A~Z���� for�� ����ؼ� ��� 65~90
		System.out.println("���� 1.");
		
		int i;
		for(i=65;i<=90;i++) {
			System.out.print((char)i);
		}
		
		
		//2. ���� �Է� �޾Ƽ� 1~�Է¹������� ������ 7�ǹ���� ������ �? and 7�� ������� �հ�
		System.out.println("\n\n���� 2.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�:");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		for(i=1;i<=num;i++) {
			if(i%7==0) {
				count += 1;
				sum += i;
			}
		}

		System.out.println("7�� ����� ����: " + count);
		System.out.println("7�� ����� ��: " + sum);

	}
}
