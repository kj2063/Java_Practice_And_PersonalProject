import java.util.HashMap;
import java.util.Scanner;

public class Ex09_13_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("pencil", "����");
		dic.put("sky", "�ϴ�");
		dic.put("desk", "å��");
		dic.put("face", "��");
		
		System.out.println(dic);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ã�� �ܾ��?(q�Է½� ����) :");
			String key = sc.next();
		
			if(key.equals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println();
				break;
			}
			else if(dic.get(key) == null) {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				System.out.println();
			}
			else {
				System.out.println("�� : " + dic.get(key));
				System.out.println();
			}
		
		}
		
		
	}
}
