
public class Ex03_05_switch_case {
	public static void main(String[] args) {
		
		String fruit = "grape";
		
		switch(fruit) {
			case "apple":
				System.out.println("���");
				break;
			case "grape": //grape �� Grape���� ���� ��� ���� ���̰� ������ �̷��� �ڵ��ص� ��.
			case "Grape":
				System.out.println("����");
				break;
			case "banana":
				System.out.println("�ٳ���");
				break;
			default:
				System.out.println("�� ���� ����");
		}
		
		System.out.println("switch~case ������");
	}
}
