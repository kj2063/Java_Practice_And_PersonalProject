import java.util.Scanner;

public class Ex01_05_�Է¹� {
	public static void main(String[] args) {
		//�Է�
		Scanner sc = new Scanner(System.in);
		/*�ﰢ���� �غ��� ���� �Է�
		�ﰢ���� ���� �Է�
		�ﰢ���� ����: 1/2 * �غ� * ����
		�ﰢ���� ������ ~ �Դϴ�.*/
		double height;
		double base_line;
		
		System.out.print("�ﰢ���� �غ��� ���� �Է�:");
		base_line = sc.nextDouble();
		
		System.out.print("�ﰢ���� ���� �Է�:");
		height = sc.nextDouble();
		
		double area = .5 * height * base_line;// .5�� 1/2�� ����Ҷ� �����ؾ��� ��. ����/���� �̹Ƿ� 0�� �ȴ�. 1.0/2 or 1/2.0�� ����ص� �ȴ�.
		System.out.printf("�ﰢ���� ������ %f�Դϴ�.",area);
		
		
	}
}
