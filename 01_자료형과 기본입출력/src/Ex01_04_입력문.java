import java.util.Scanner;

public class Ex01_04_�Է¹� {
	public static void main(String[] args) {
		int a;
		a = 80;
		
		System.out.println("a:" + a);
		
		int kor,eng,math;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��Է�:");
		name = sc.next();//��ĳ�ʷ� �аڴ�. ���ڿ� �Է��ض� 
		/*
		next() :���ڿ� �Է�
		nextInt() :���� �Է�
		nextFloat() :�Ǽ�(float) �Է�
		nextDoble() :�Ǽ�(double) �Է�
		etc...
		*/
		System.out.print("�������� �Է�:");
		kor = sc.nextInt();// ��ĳ�ʷ� �аڴ� ���� �Է��ض� 
		
		System.out.print("�������� �Է�:");
		eng = sc.nextInt();// ��ĳ�ʷ� �аڴ� ���� �Է��ض�
		
		System.out.print("�������� �Է�:");
		math = sc.nextInt();// ��ĳ�ʷ� �аڴ� ���� �Է��ض�
		
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("math:" + math);
		
		int total = kor + eng + math;
		System.out.println(name + "�� ������:" + (total));
		
		int avg = total/3;
		System.out.println(name + "�� �������:" + (avg));
		double avg2 = (double)total/3; //int type �� total �̳� 3 ���߿� �ϳ��� float �������� �ٲٸ� avg2 ���� float type ���� ���� �� �ִ�.
		//double avg2 = total/3.0 //�̰͵� �����ϴ�.
		System.out.printf("�� ���(�Ҽ���):%.2f\n",avg2);
	}
}
