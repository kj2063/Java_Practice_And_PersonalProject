import java.util.Scanner;
public class Ex07_05_���ڸ��߱� {
	public static void main(String[] args) {
		
		/*
		Math.random() : 0 <= result < 1 �ΰ��� ��� 
		 
		int d = (int)(Math.random()*15)+25;
		//25~39 ���� ���� �߻� => 39 -25 +1 =15 
		
		int d = (int)(Math.random()*38) +100;
		//100~137 ���� ���� �߻� => 137 -100 +1 =	38	
		*/
		
		int answer = (int)(Math.random()*100) +1;
		//1~100 ���� ���� �߻�
		
//		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.print("1~100�� ���� �Է��ϼ��� : ");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			
			} catch(Exception e) {
				System.out.println("��ȿ���� ���� ���� �Էµƽ��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("������ϴ�.");
				System.out.printf("�õ��� Ƚ���� %d�� �Դϴ�.",count);
				break;
			}
		} while(true);
		
			
		
		
	}
}
