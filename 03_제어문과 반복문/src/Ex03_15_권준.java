import java.util.Scanner;

public class Ex03_15_���� {
	public static void main(String[] args) {
		
		//���Է� �ƹ��ų�~, ������ �Է��Ҷ����� ��� �Է�, ������ �Է��ϸ� ���� �Է� �������� �հ� ������ �ϱ�.
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� �Է�:");//���Է�
			num = sc.nextInt();
			if (num>0)
				sum += num;
			else
				break;			//�Է��� ���ڰ� �����̸� �ݺ��� ����������
		}
		System.out.printf("\n���ݱ��� �Է��� ����� ��:%d",sum);
	}
}
