import java.util.Scanner;

public class Ex03_03_ifelse_���� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int music, sci, hist;

		System.out.print("�̸� �Է�:");
		name = sc.next(); 
		System.out.print("�������� �Է�:");
		music = sc.nextInt();
		System.out.print("�������� �Է�:");
		sci = sc.nextInt();
		System.out.print("�������� �Է�:");
		hist = sc.nextInt();

		//�հ�, ���(�Ҽ��� �Ʒ� 2�ڸ�) ���
		int total = music + sci + hist;
		double avg = (double)total/3;
		System.out.printf("����:%d\n", total);
		System.out.printf("���:%.2f\n", avg);

		if(avg >= 90) {
			System.out.println("A����");
		} else if (avg>=80) {
			System.out.println("B����");
		} else if (avg>=70) {
			System.out.println("C����");
		} else if (avg>=60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		} // else if �� (avg>=80 && avg<90) �� �ƴ� (avg>=80)�� �־ �ȴ�. if�� ���� else if �� ���ʷ� ����ǹǷ�!

		System.out.println("--------------------");

		if(avg>=90) {
			System.out.println("A����");
		} 
		if(avg>=80 && avg<90) {
			System.out.println("B����");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C����");
		} 
		if(avg>=60 && avg<70) {
			System.out.println("D����");
		}
		if(avg<60) {
			System.out.println("F����");
		} //��� if�� Ȯ���ϹǷ� ��ȿ����

		System.out.println("--------------------");

		String hakjum = ""; 
		// String hakjum = "F����"; 
		// String hakjum; �̶�� �����ϸ� error �߻�.
		// 90���뵵 80���뵵 �ƴҶ� ��µ� "" �Ǵ� "F����"���� �ʱ�ȭ ����� �Ѵ�.

		if(avg>=90) {
			hakjum = "A����";		
			if(avg>=95) {
				hakjum = hakjum + "+";
			} else {
				hakjum = hakjum + "-";
			}
		} else if(avg>=80) {
			hakjum = "B����";
			if(avg>=85) {
				hakjum = hakjum + "+";
			} else {
				hakjum = hakjum + "-";
			}
		}

		System.out.println(hakjum);

		System.out.println("---------------------");

		// ������ ����
		// switch~case �� �̿��Ͽ� ��տ� ���� ���� ���
		
		//1
		System.out.println("���� ���\n");
		System.out.print("+,- ��ȣ ���� ���� : ");
		
		switch((int)avg/10) {
		case 10:
		case 9:
			System.out.print("A����");
			break;
		case 8:
			System.out.print("B����");
			break;
		case 7:
			System.out.print("C����");
			break;	
		case 6:
			System.out.print("D����");
			break;
		default:
			System.out.println("F����");
		}
		
		//2
		System.out.print("\n+,- ��ȣ �ִ� ���� : ");
		switch((int)avg/10) {
		case 10:
			System.out.print("A����+");
			break;
		case 9:
			System.out.print("A����");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;
		case 8:
			System.out.print("B����");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;
		case 7:
			System.out.print("C����");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;	
		case 6:
			System.out.print("D����");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;
		default:
			System.out.println("F����");
		}
		

	}
}
