
public class Ex05_12_overloading { //하나의 메서드 이름으로 여러개의 메서드를 만들 수 있게 해주는 기법
	public static void main(String[] args) {
		
		int x = plus(3,5,7);
		System.out.println("x:" + x);
		
		float y = plus(0.12f,0.34f);
		System.out.println("y:" + y);
		
		double z = plus(0.01, 0.02, 0.03);
		System.out.println("z:" +z);
	}	
		
	static int plus(int a,int b,int c) {
		return a + b + c;
	}	
		
	static float plus(float a , float b) {
		return a + b;
	}	

	static double plus(double a , double b, double c) {
		return a + b + c;
	}	
	
	
}	
/*
메서드 오버로딩(overloading)
- 메서드 이름이 같아야 한다
- 매개변수의 개수와 자료형(타입)이 달라야 한다

오버라이딩(overriding) <==> 오버로딩(overloading) //두가지를 구분 할 수 있어야 함
*/