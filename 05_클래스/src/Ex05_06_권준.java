import java.util.Scanner;

class Student {
	String name;
	int kor, eng, math;
	
//�հ踦 �����ϴ� sum �޼��� ����
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
//����� �����ϴ� avg �޼��� ����
	static double avg(int a, int b, int c) {
		return (a+b+c)/(double)3;
	}
	
}


public class Ex05_06_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.print("�̸�:");
		std.name = sc.next();
		System.out.print("���� ����:");
		std.kor = sc.nextInt();
		System.out.print("���� ����:");
		std.eng = sc.nextInt();
		System.out.print("���� ����:"); //�Է¹޾Ƽ� student class�� �Է��ϰ� ��������غ���
		std.math = sc.nextInt();
		
		/*
		System.out.println(�̸�:);
		System.out.println(����);
		System.out.println(����);
		System.out.println(����);

		System.out.println("�հ� : ");
		System.out.println("��� : ");
		*/
		System.out.println("------���------");
		System.out.println("�̸� = " + std.name);
		System.out.println("�������� = " + std.kor);
		System.out.println("�������� = " + std.eng);
		System.out.println("�������� = " + std.math);
		System.out.println();
		System.out.println("�հ� = " + Student.sum(std.kor, std.eng, std.math));
		System.out.printf("��� = %.2f",Student.avg(std.kor, std.eng, std.math));
		
		
	}
}
