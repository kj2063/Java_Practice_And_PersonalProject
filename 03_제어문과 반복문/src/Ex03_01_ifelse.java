import java.util.Scanner;

public class Ex03_01_ifelse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("a�� �Է�:");
		a = sc.nextInt();
		System.out.print("b�� �Է�:");
		b = sc.nextInt();
		
		//a�� �� ũ�� a�� ��� b�� �� ũ�� b�� ���
		if(a>b) {
			System.out.println("a�� �� ũ��");
		} else {
			System.out.println("b�� �� ũ��");
		}
		
		System.out.println("--------------------");
		
		if(a>b) {
			System.out.println("a�� �� ũ��");
			System.out.println("������");
		} else if(a<b) {
			System.out.println("b�� �� ũ��");
			System.out.println("������");
		} else {// �׷��� ������(a==b)
			System.out.println("a�� b�� ����");
			System.out.println("ȣȣȣ");
		}
		// �߰�ȣ ���� ��ɹ��� 1���� ��� �߰�ȣ�� �Ƚᵵ ������.
		// if else ������ ó���� ���� ������ �׳� pass
		
		System.out.println("if~else ������");
		
	}
}
