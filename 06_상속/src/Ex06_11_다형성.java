class Robot{
	
}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Ex06_11_다형성 {
	public static void main(String[] args) {
		
//		DanceRobot dr = new DanceRobot();
//		SingRobot sr = new SingRobot();
//		DrawRobot drr = new DrawRobot();
		
//		Robot dr = new DanceRobot();
//		Robot sr = new SingRobot();
//		Robot drr = new DrawRobot();
		
//		dr.dance();
//		sr.sing();
//		drr.draw(); // 부모클래스에 메서드가 없기 때문에 error 발생
		
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
	
		for(int i=0; i<arr.length ; i++) {
			action(arr[i]);
		}
		
	}//main
	
	static void action(Robot r) { //Robot r에 arr가 들어오면서 자동 업캐스팅 됨.
		if (r instanceof DanceRobot) {// 다운캐스팅
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot drr = (DrawRobot)r;
			drr.draw();
		}
	}
}
