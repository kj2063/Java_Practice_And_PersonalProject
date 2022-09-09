class Count {
	static int a;//객체 생성시 자동으로 0이 들어감 //static 이므로 객체 생성시 공통적인 주소 1개만 생성된다.
	int b;//객체 생성시 자동으로 0이 들어감 
	void increment() {
		int c=0; //지역변수 : 객체 생성시 값이 0 이 안되므로 꼭 초기화를 해주어야 함
		a++;
		b++;
		c++;
		System.out.println("static 변수 a: " + a);
		System.out.println("인스턴스 변수 b: " + b);
		System.out.println("지역 변수 c: " + c);
		System.out.println();
	} // increment
	
	/*
	void abc() {
		System.out.println(c);
	}
	*/
} // Count


public class Ex05_08_변수 { // 멤버변수: 클래스 안에 있는 변수 , 인스턴스변수, 참조변수, static변수(클래스변수), 매개변수, 지역변수
	public static void main(String[] args) {
		System.out.println("객체1 생성");
		Count c1 = new Count();
		c1.increment();
		c1.increment();
		
		System.out.println();
		
		System.out.println("객체2 생성");
		Count c2 = new Count();
		c2.increment();
		c2.increment();
		
		System.out.println();
		
		System.out.println("객체3 생성");
		Count c3 = new Count();
		c3.increment();
		c3.increment();	
		
		System.out.println("___________________");
		
		for(int i = 1; i<4; i++) {
			System.out.print(i+"  ");
		}
	}
}
/*
멤버변수(전역변수?): 클래스 안에 있으면서 메서드 안에는 없는 변수  
참조변수
인스턴스변수: 생성시점 => 객체생성시, 소멸시점 =>
static변수(클래스변수): 생성시점 => ~~ 생성된다, 소멸시점 =>
지역변수: 생성시점 => ~~ 생성된다, 소멸시점 =>
매개변수
*/