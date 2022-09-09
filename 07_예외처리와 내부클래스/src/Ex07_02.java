
public class Ex07_02 {
	public static void main(String[] args) {
		
		String str1 = "";//아무것도 넣지 않을때 = "" 를 넣어줘야 초기화가 된다.
		System.out.println(str1);
		System.out.println(str1.length());// String class를 사용할때 .length() 를 사용하면 문자의 갯수를 알 수 있다.
		
		try{//String str = "bananan";
			String str = null;// 인스턴스 변수 일때 class의 기본값은 null이 들어가지만 지역 변수 일때는 null 을 넣어줘야 한다.
			System.out.println(str);
			System.out.println(str.length());//NullPointerException 발생시 해당 객체가 만들어짐. new NullPointerException()
			
			System.out.println("하하하");// error발생-> 객체생성 -> 객체를 받을 수 있는 catch 로 바로 온다. //따라서 해당 코드는 실행되지 않는다.
			
			// NullPointerException e <= new NullPointerException() //생성된 객체를 받을 수 있는 변수가 있으면 실행.
		} catch(NullPointerException e) {
			System.out.println("예외처리 루틴 실행");
			//return; // 리턴을 쓰면 아래의 코드들이 실행되지 않고 종료된다. 
		} finally {
			System.out.println("finally 부분");//finally부분은 예외가 발생 하던 안하던 실행.
		}
		
		System.out.println("프로그램 종료");//error가 난 이후 코드는 실행이 되지 않는다. 하지만 예외처리를 하여 나오게 할 수 있다.
	}
}
