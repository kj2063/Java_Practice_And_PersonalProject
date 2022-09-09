interface RemoteController{
	void turnOn(); //public abstract void trunOn();
	void turnOff();
	
}

public class Ex07_15_익명 {
	public static void main(String[] args) {
		
		RemoteController r = new RemoteController() {
			
			@Override
			public void turnOn() { //interface에서와 똑같이 public 을 붙어여줘야 한다! abstract 는 완성되었으니 없애야 한다.
				System.out.println("TV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다");
			}
		};
		r.turnOn();
		r.turnOff();
	}
}
