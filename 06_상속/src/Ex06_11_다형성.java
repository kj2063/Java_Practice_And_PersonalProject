class Robot{
	
}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �θ��ϴ�.");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Ex06_11_������ {
	public static void main(String[] args) {
		
//		DanceRobot dr = new DanceRobot();
//		SingRobot sr = new SingRobot();
//		DrawRobot drr = new DrawRobot();
		
//		Robot dr = new DanceRobot();
//		Robot sr = new SingRobot();
//		Robot drr = new DrawRobot();
		
//		dr.dance();
//		sr.sing();
//		drr.draw(); // �θ�Ŭ������ �޼��尡 ���� ������ error �߻�
		
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
	
		for(int i=0; i<arr.length ; i++) {
			action(arr[i]);
		}
		
	}//main
	
	static void action(Robot r) { //Robot r�� arr�� �����鼭 �ڵ� ��ĳ���� ��.
		if (r instanceof DanceRobot) {// �ٿ�ĳ����
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
