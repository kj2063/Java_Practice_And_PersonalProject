
public class Ex05_03_메서드 { // 메서드 : 특정한 작업을 독립적으로 수행하도록 하게 하는것. 필요할 때 마다 호출해서 사용.
	public static void main(String[] args) {// main 메서드는 코드의 어디에 위치해 있던 제일 먼저 실행된다.
		
		int sum;
		
		//sum = 1+2;
		sum = add(1,2); // add 메서드 호출
		System.out.println("sum : " + sum);
		
		//sum = 11+23;
		sum = add(11,23);
		System.out.println("sum : " + sum);
		
		//sum = 546+232;
		sum = add(546,232);
		System.out.println("sum : " + sum);
		
		/*
		3.1, 2, 1
		128.4, 8, 15 의 합 호출해보기
		*/
		System.out.println();
		
		subtract(3.1,2,1);
		subtract(128.4,8,15);
		
		System.out.println();
		
		mul();
		
	} //main
	
	static int add(int a, int b) { //add 메서드 정의  //a, b : 매개변수
		int c = a+b;
		return c;
	}
	
	/*
	static double subtract(double a, int b, int c) {
		double d = a-b-c;
		return d;
	}
	*/
	 
	// 다음과 같이 동일한 메서드를 만들 수 도 있다. 
	static void subtract(double a, int b, int c) {
		double d = a-b-c;
	 	System.out.println("d : " + d);
	 	//return; -> 리턴 할 값이 없으면 retrun; 이라고 쓰던가 아무값도 쓰지 않아도 된다.
	}
	
	static void mul(){
		System.out.println(3*4);
	}
	
}

/*
리턴타입 메서드이름(타입 변수명, 타입 변수명, ...) { //선언부
	메서드 호출시 수행될 코드
}
*/
