class Vehicle { //탈것, 차량
	private int wheel;
	private String horn;//경적
	
	Vehicle(int wheel, String horn){
		this.wheel = wheel;
		this.horn = horn;
	}
	
	int getWheel() {
		return wheel;
	}
	String getHorn() {
		return horn;
	}
}//Vehicle

class KickBoard extends Vehicle{
//	private int wheel;
//	private String horn;//경적
	
	boolean hat; //안전모(true:착용함, false:착용안함)
	
	KickBoard(int wheel, String horn, boolean hat){
		super(wheel,horn);
		this.hat = hat;
	}
	
	int getWheel(){
		return super.getWheel();
	}
	
	String getHorn() {
		return super.getHorn();
	}
	
	String getHat() {
		if(hat == true)
			return "착용";
		else 
			return "미착용";
	}
	
}//KickBoard

class Taxi extends Vehicle{
//	private int wheel;
//	private String horn;//경적

	int door;

	Taxi(int wheel, String horn, int door){
		super(wheel,horn);
		this.door = door;
	}
	
	void display() {
		System.out.println("Taxi 바퀴수: " + super.getWheel());
		System.out.println("Taxi 경적소리: " + super.getHorn());
		System.out.println("Taxi 문 수: " + door);
	}
}//Taxi

public class Test_권준 { // youn1223@daum.net 12:40분 1번만
	public static void main(String[] args) {
		KickBoard k = new KickBoard(2,"따르릉",true); //킥보드
		Taxi t = new Taxi(4,"빵빵",4);
		
		
//		KickBoard: getter 3개로 출력
//		Taxi : display 메서드에서 3줄로 출력

		System.out.println("KickBoard 바퀴수: " + k.getWheel());
		System.out.println("KickBoard 경적소리: " + k.getHorn());
		System.out.println("KickBoard 헬멧 착용여부: " + k.getHat());
		
		System.out.println();
		
		t.display();
	}
}
