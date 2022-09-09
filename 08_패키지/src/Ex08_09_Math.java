import static java.lang.Math.*; // Math class의 static 메서드는 Math를 쓰지 않아도 사용 할 수 있게 하겠다.

public class Ex08_09_Math {
	public static void main(String[] args) {
		
		
		System.out.println(Math.max(10, 20)); //큰 값 출력
		
		int random = (int)(Math.random()*36) + 10;
		// 10~45 정수 난수 발생
		
		System.out.println("random : "+ random);
		
		long l = round(4.3); //Math.round() : 반올림 메서드 
		System.out.println("l:" +l);

		double c = ceil(4.32); //Math.ceil() : 올림 메서드
		System.out.println("c:" + c);

		double f = floor(4.82); //Math.floor() : 내림 메서드
		System.out.println("f:" + f);
		
		double p = pow(2,4); //Math.pow(2,4) : power 값 retrun, 2의 4승값 
		System.out.println("p:" + p);
		
	}
}
