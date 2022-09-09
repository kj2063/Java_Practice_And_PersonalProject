import java.util.HashMap;
import java.util.Scanner;

public class Ex09_13_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		
		System.out.println(dic);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾는 단어는?(q입력시 종료) :");
			String key = sc.next();
		
			if(key.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break;
			}
			else if(dic.get(key) == null) {
				System.out.println("잘못 입력하였습니다.");
				System.out.println();
			}
			else {
				System.out.println("뜻 : " + dic.get(key));
				System.out.println();
			}
		
		}
		
		
	}
}
