
public class Ex03_04_switch_case {
	public static void main(String[] args) {
		
		int num = 2;
		
		
		switch(num+1) { //switch() ��ȣ �ȿ� ������ ���� �ȴ�. but ���� ������,���ڿ�,���ĸ� ��� �� �� �ִ�. �Ǽ����� �ȵȴ�.
			case 1:
				System.out.println("1�Դϴ�");
				System.out.println("one");
				break; //����������
			case 2:
				System.out.println("2�Դϴ�");
				System.out.println("two");
				break;
			case 3:
				System.out.println("3�Դϴ�");
				System.out.println("three");
				break;
			default: // ����͵� �ش� ���� ������ �����ϴ� ���. �־ �ǰ� ��� ��. ������� �ش�Ǵ� case�� ������� pass��.
				System.out.println("1~3�� ���� �ƴմϴ�.");
				//break; // �Ƚᵵ �Ǵµ� �ᵵ�� �̰��� �̻��ڳ�
		}
		System.out.println("switch~case �����ϴ� ��");
		
	}
}
