
public class Ex08_06_Wrapper { //wrapper class : 기본 자료형 8가지를 객체로 만들고 싶을때 사용
	public static void main(String[] args) {
		
		//기본자료형을 객체로 만들고 싶을 때 : 1번예제 참고
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		Integer it1 = new Integer(11);
		Integer it2 = new Integer(22);
		System.out.println(it1 + it2);
		
		Integer it3 = 30; // new Integer(30) : autoboxing>기본형 데이터가 객체형태로 바뀌는 것
		Integer it4 = 40; // new Integer(40) 
		System.out.println(it3 + it4);
		
		int x = new Integer(50); // new Integer(50) => 50 : unboxing
		int y = new Integer(60);
		System.out.println(x+y);
		
		
		//.parseInt() & .valueOf()
		
		int i = Integer.parseInt("100"); //문자열 "100" -> 숫자(정수) 100 으로 바꿔라 //int로 return
		int j = Integer.parseInt("200"); 
 		System.out.println(i+j);
 		
 		double d1 = Double.parseDouble("123.4");
 		double d2 = Double.parseDouble("345.4");
 		System.out.println(d1+d2);
 		
 		Integer i2 = Integer.valueOf("123"); //"123" => new Integer(123)
 		//int i2 = Integer.valueOf("123"); //"123" => new Integer(123)
 		//int i2 = new Integer(123); unboxing 됨.
 		
 		Integer j2 = Integer.valueOf("789"); //문자열 "100" -> 숫자(정수) 100 으로 바꿔라 //Integer로 return (객체 형태로 만들어 return)
 		System.out.println(i2+j2);
 		
 		
	}
}
