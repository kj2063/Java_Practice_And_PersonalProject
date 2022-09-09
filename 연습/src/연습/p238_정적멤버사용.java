package 연습;
	
class Calculator_class{
	
	static double pi =3.14159; //static(정적) 은 객체를 생성하지 않고 사용 할 수 있게 해준다.
							   // Calculator(클래스).~(변수or메소드) 로 객체 생성 없이 바로 사용.
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
}

public class p238_정적멤버사용 {
	public static void main(String[] args) {
		
		Calculator_class cal = new Calculator_class();
		//p238_Calculator = new p238_Calculator();
		System.out.println(cal.pi); //static(정적) 메소드는 원칙적으로 클래스 이름으로 접근해야하지만 -> p238_Calculator.pi 
									//다음과 같이 객체 참조 변수로도 접근이 가능하다.
									// 근데 가끔 에러 발생. 왜? => Calculator라는 클래스로 만들면 기존의 calculator 클래스와
									// 충돌이 있는듯....? Calculator_class 라는 클래스 명으로 바꿔줬더니 괜찮아짐.
									// or 다른 패키지에 있는 Calculator 와 충돌이 있는듯.
		
		System.out.println(Calculator_class.pi);
		System.out.println(p238_Calculator.pi);
		//System.out.println(p238_Calculator.pi);
		
		System.out.println();
		
		Calculator_class.pi = 3.14; //다음과 같이 초기화 할 수 있다.
		System.out.println(Calculator_class.pi);
		
	} 
}


