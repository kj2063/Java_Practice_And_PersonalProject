import java.util.Scanner;

public class Ex03_02_ifelse {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���:");
		num = sc.nextInt();
		
		//if(num==1 || num==2 || num==3 || ... || num==10){}
		if(num>=1 && num<=10 && num!=3) { //1~10 ���� �� �߿� 3�� �ƴѼ�
			System.out.println("1~10������ ���� but 3�� �ƴϴ�.");
		}
		//or if (num>=1 && num<=10){ if (num!=3){ } } �̿� ���� if �� �ȿ� if ���� �־� ó�� �� �� �� �ִ�.
		
		System.out.println("if~else ������");
		System.out.println("----------------------");
		
		if(num>=1 && num<=10) {
			System.out.println("1~10������ ����");
		} else if (num>=11 && num<=20) {
			System.out.println("11~20������ ����");
		} else if (num>=21 && num<=30) {
			System.out.println("21~30������ ����");
		}
		
		// ��� ������ Ȯ���� ���� �Ҷ��� if �����θ� �ڵ带 §��.
		
		System.out.println("if~else ������");
		
		if(num%5 == 0) {
			System.out.println("5�� ���");
		}	
		if(num%10 == 0) {
			System.out.println("10�� ���");
		}
		
		
	}
}
