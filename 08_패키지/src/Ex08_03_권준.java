import java.util.Scanner;

public class Ex08_03_권준 {
	public static void main(String[] args) {
		
		/*
		1번문제
		
			문자열 입력: Hello.java
			화일명: Hello
			확장자: java
			. 앞은 화일명 뒤는 확장자
		
		2번문제
			String id = "kim";
			String pw = "1234";
			
			id(inputId:변수)와 pw(inputPw:변수)를 입력
			
			id와 pw가 모두 같으면 로그인 가능합니다.
			id or pw 가 다르면 로그인 불가능 합니다 출력.
			
		*/
		String st;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번문제");
		
		while(true) {
			try {

				System.out.print("문자열(파일명) 입력:");

				st = sc.next();

				int i = st.indexOf(".");

				System.out.println("화일명:" + st.substring(0,i));
				System.out.println("확장자:" + st.substring(i+1));
				break;
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("====제대로 된 파일명을 입력해 주세요.====");
			}
		}
		
		
		System.out.println();
		
		System.out.println("2번문제");
		
		String id = "kim";
		String pw = "1234";
		
		String input_id;
		String input_pw;
		
		while(true) {
			System.out.print("ID를 입력해 주세요:");
			input_id = sc.next();
			System.out.print("PW를 입력해 주세요:");
			input_pw = sc.next();
			
			if(input_id.equals(id) && input_pw.equals(pw)) {
				System.out.println("=====로그인 되었습니다.=====");
				break;
			}
			else {
				System.out.println("=입력하신 ID 또는 PW가 존재하지 않습니다=");
				System.out.println("========다시 입력해 주세요.=========");
			}
		}
		
		
		
	}//main
}//
