import java.util.Scanner;

public class Ex08_03_���� {
	public static void main(String[] args) {
		
		/*
		1������
		
			���ڿ� �Է�: Hello.java
			ȭ�ϸ�: Hello
			Ȯ����: java
			. ���� ȭ�ϸ� �ڴ� Ȯ����
		
		2������
			String id = "kim";
			String pw = "1234";
			
			id(inputId:����)�� pw(inputPw:����)�� �Է�
			
			id�� pw�� ��� ������ �α��� �����մϴ�.
			id or pw �� �ٸ��� �α��� �Ұ��� �մϴ� ���.
			
		*/
		String st;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1������");
		
		while(true) {
			try {

				System.out.print("���ڿ�(���ϸ�) �Է�:");

				st = sc.next();

				int i = st.indexOf(".");

				System.out.println("ȭ�ϸ�:" + st.substring(0,i));
				System.out.println("Ȯ����:" + st.substring(i+1));
				break;
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("====����� �� ���ϸ��� �Է��� �ּ���.====");
			}
		}
		
		
		System.out.println();
		
		System.out.println("2������");
		
		String id = "kim";
		String pw = "1234";
		
		String input_id;
		String input_pw;
		
		while(true) {
			System.out.print("ID�� �Է��� �ּ���:");
			input_id = sc.next();
			System.out.print("PW�� �Է��� �ּ���:");
			input_pw = sc.next();
			
			if(input_id.equals(id) && input_pw.equals(pw)) {
				System.out.println("=====�α��� �Ǿ����ϴ�.=====");
				break;
			}
			else {
				System.out.println("=�Է��Ͻ� ID �Ǵ� PW�� �������� �ʽ��ϴ�=");
				System.out.println("========�ٽ� �Է��� �ּ���.=========");
			}
		}
		
		
		
	}//main
}//
