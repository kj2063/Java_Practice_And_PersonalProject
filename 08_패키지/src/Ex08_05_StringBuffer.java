//import java.lang.*; java.lang 패키지에 있는 클래스들은 따로 import하지 않아도 자동으로 불러와 준다. 많이 쓰기 때문에...


public class Ex08_05_StringBuffer {
	public static void main(String[] args) {
		
		//StringBuffer sb = "java"; //String 처럼 문자열을 처리할 수 있는 class. String 과 다르게 다음과 같이 실행되지는 않는다.
		
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		
		System.out.println(sb.equals(sb2)); //Object.equals() 에서와 같이 주소를 비교
		
		//String 수정 불가능한 class
		//StringBuffer 수정 가능한 class
		String str1 = "Have";
		String str2 = " a";
		String str3 = " nice day";
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
		
		String str5 = str4.replace("nice", "good");//"good" 이 들어올 새로운 주소가 만들어짐.
		System.out.println(str5);
		
		System.out.println();
		
		
		
		StringBuffer sb3 = new StringBuffer("Have");
		sb3.append(" a"); //StringBuffer.append(" a") : 기존의 주소 변경없이 " a"가 추가됨.  
		sb3.append(" nice day");
		StringBuffer sb4 = sb3.replace(7,11,"good"); // 문자열의 7번째부터 11번째 앞까지 있는 문자를 "good"으로 변경함
		System.out.println(sb4);
		
	}
}
