
public class Ex07_01 {
	public static void main(String[] args) {
		
		String str1 = "";//아무것도 넣지 않을때 = "" 를 넣어줘야 초기화가 된다.
		System.out.println(str1);
		System.out.println(str1.length());// String class를 사용할때 .length() 를 사용하면 문자의 갯수를 알 수 있다.
		
		String str = null;// 인스턴스 변수 일때 class의 기본값은 null이 들어가지만 지역 변수 일때는 null 을 넣어줘야 한다.
		System.out.println(str);
		System.out.println(str.length());//NullPointerException
		
		System.out.println("프로그램 종료");//error가 난 이후 코드는 실행이 되지 않는다.
	}
}
