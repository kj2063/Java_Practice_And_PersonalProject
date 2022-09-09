class Calculator { // class의 2가지 종류 : 1.새로운 자료형 생성 , 2. 실행 클래스
	int x;
	int y;
		
	int sum(int a,int b) {
		return a+b;
	}
		
	int max(int x, int y){
		if(x>y) 
			return x;
		else
			return y;
	}
		
}
		
public class Ex05_04_메서드 { //main 메서드를 갖고있는 클래스 -> 실행클래스
	public static void main(String[] args) {
		
		//x와 y에 10과 20 넣고 출력해보기		
		Calculator c = new Calculator();
		c.x = 10;
		c.y = 20;
		
		System.out.printf("x=%d  y=%d",c.x,c.y);
		System.out.println("\nsum = " + c.sum(c.x,c.y));
		System.out.println("111 과 222 중 큰 수는? : "+ c.max(111,222));
		
		System.out.println();
		
		Ex05_04_메서드 ex = new Ex05_04_메서드();
		ex.prn();
		
		show();
	} // main
	
	void prn(){ //리턴타입은 꼭 있어야 한다. return이 없다고 리턴타입을 안쓰면 안된다.
		System.out.println("메서드 공부중~");
	}
	
	static void show() {
		System.out.println("show() 정의 ");
	}

}// Ex05~


