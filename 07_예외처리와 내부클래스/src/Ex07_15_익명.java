interface RemoteController{
	void turnOn(); //public abstract void trunOn();
	void turnOff();
	
}

public class Ex07_15_�͸� {
	public static void main(String[] args) {
		
		RemoteController r = new RemoteController() {
			
			@Override
			public void turnOn() { //interface������ �Ȱ��� public �� �پ��� �Ѵ�! abstract �� �ϼ��Ǿ����� ���־� �Ѵ�.
				System.out.println("TV�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�");
			}
		};
		r.turnOn();
		r.turnOff();
	}
}
