
public class Ex02_02_복합대입 {
	public static void main(String[] args) {
		
		int a=10, b=20, c=30, d=40, e=50;
		
		System.out.println("a="+ a);
		a += 3;//복합 대입연산자 //a = a + 3;
		System.out.println("a="+ a);

		System.out.println("b="+ b);
		b -= 7; //b = b-7;
		System.out.println("b="+ b);
		
		System.out.println("c="+ c);
		c *= 4; //c = c*4
		System.out.println("c="+ c);
		
		System.out.println("d="+ d);
		d /= 10; //d = d/10
		System.out.println("d="+ d);

		System.out.println("e="+ e);
		e %= 3; //e = e%3  //결과값2
		System.out.println("e="+ e);
		
		
		String fruit = "banana";
		System.out.println("fruit="+ fruit);
		
		fruit = fruit + "apple";//문자열의 + 경우, 문자열의 연결을 의미한다.
		System.out.println("fruit="+ fruit); // result -> fruit = bananaapple
		
	}
}
