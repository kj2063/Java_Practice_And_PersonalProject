public class Ex01_01_println {
	public static void main(String[] args) {
		System.out.println("자바 첫번째 예제");
		System.out.println("1+2");
		
		//System.out.println('1+2');
		System.out.println("A");
		System.out.println('B'); //''안에는 한글자만 들어갈 수 있다.
		
		// 주석문:실행X, 설명문
		System.out.println("오늘은 " + "즐거운 " + "화요일 입니다.");
		System.out.println(1+2);
		System.out.println("1+2=" + 1+2 ); //문자열 뒤에 나오는 + 는 다 연결  => 우선순위를 높이고 싶으면 괄호로 씌움
		System.out.println("1+2=" + (1+2) );
		System.out.println(1+2 + "1+2=\n\n" ); //연산 후 문자열이 나오면 연결
//--------------------------------
		
		//서식문자 : %d %c %f %s
		int a = 12; // %d : 이자리에 '정수'출력할거다
		char b = 'B';// %c : '문자'
		float c = 72.346f;// %f
		String d = "아이유";// %s
		
		System.out.println("a=" + a + "입니다"); // a=12입니다
		System.out.printf("a=%d입니다\n",a);//printf(print_format) 로 바꿔 동일하게 출력하려면 다음과 같이 하면 된다. 

		System.out.printf("b=%c입니다\n",b);//b=B입니다
		//System.out.printf("b=%d입니다",b);
		System.out.printf("b=%d입니다\n\n",(int)b);//b=66입니다

		
		System.out.printf("c=%f입니다\n",c);//c=72.346001입니다 //컴퓨터가 실수 처리를 완벽하게 못하여 약간의 오차가 있을 수 있다.
		System.out.printf("c=%.2f입니다\n",c);//%.2f 소숫점 2자리까지만 나오게 해라. 3번째 자리는 반올림한다.
		System.out.printf("c=%8.2f입니다\n\n",c);//8자리를 잡고 출력하되 소숫점 2자리까지만 나오게 해라(빈자리는 공백으로 나타낸다)

		System.out.println("저의 이름은 " +d+ "입니다");//저의 이름은 아이유 입니다
		System.out.printf("저의 이름은 %s 입니다\n\n",d);
		
		/*
		\\ -> \를 print 하고싶을때 
		\t -> tap키를 누르는 만큼 띄어쓸때
		\" -> 작은 따옴표(')는 그냥 써도 되는데 "를 print 하고싶을때
		*/ 
		System.out.println("안녕\\하세요!\t저의 '이름'은 \"홍길동\" 입니다.");
		
	}
}
