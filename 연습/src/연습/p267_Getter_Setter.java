package 연습;

//클래스를 선언할때 가능하다면 필드르르 private로 선언해서 외부로부터 보호하고, 필드에 대한 setter와 getter 메소드를 작성해서 필드값을 안전하게 변경/사용 하는 것이 좋다.
class Ccar {
	private int speed;
	private boolean stop; //boolean type의 변수를 만들면 따로 초기화 하지 않아도 false 로 초기화 된다.
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { //boolean type의 경우에는 get으로 시작하지 않고 is로 시작하는것이 관례.
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}

public class p267_Getter_Setter {
	public static void main(String[] args) {
		Ccar myCar = new Ccar();
		
		
		myCar.setSpeed(-50);// 잘못된 속도 변경
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);// 올바른 속도 변경
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
