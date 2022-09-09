class Car2{
	String color = "white";
	int door = 4;
	
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!!");
	}
	
}//

class FireEngine extends Car2{
	int door = 6;
	int wheel = 10;
	
	void water() {
		System.out.println("water!!");
	}
	void drive() {
		System.out.println("FEdrive~");
	}
}//

public class Ex06_10_다형성 {
	public static void main(String[] args) {
		
		Car2 car; 
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe; //(Car2)fe 인데 자동으로 업캐스팅 타입변환 됨.
		System.out.println(car.door); //4
		//System.out.println(car.wheel); //error 발생
		System.out.println(car.color); //white
		
		System.out.println(fe.door); //6
		System.out.println(fe.wheel); //10
		System.out.println(fe.color); //white
		
		fe.drive();
		car.drive();
		//System.out.println(car.wheel);
		System.out.println();
		
		if(car instanceof FireEngine) { //instanceof 연산자: Car2 타입 객체 car를 FireEngine 타입으로 다운 캐스팅 가능한가?
			System.out.println("다운 캐스팅 가능");
		} else {
			System.out.println("다운 캐스팅 불가능");
		}
		
		fe2 = (FireEngine)car; //다운캐스팅: 부모 -> 자식 // 업캐스팅을 한 객체만 다운캐스팅 가능
		fe2.water();
		fe2.drive();
		System.out.println(fe2.door);
		System.out.println(fe2.wheel);
	
	}
}
