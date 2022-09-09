package ����;

//Ŭ������ �����Ҷ� �����ϴٸ� �ʵ帣�� private�� �����ؼ� �ܺηκ��� ��ȣ�ϰ�, �ʵ忡 ���� setter�� getter �޼ҵ带 �ۼ��ؼ� �ʵ尪�� �����ϰ� ����/��� �ϴ� ���� ����.
class Ccar {
	private int speed;
	private boolean stop; //boolean type�� ������ ����� ���� �ʱ�ȭ ���� �ʾƵ� false �� �ʱ�ȭ �ȴ�.
	
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
	
	public boolean isStop() { //boolean type�� ��쿡�� get���� �������� �ʰ� is�� �����ϴ°��� ����.
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
		
		
		myCar.setSpeed(-50);// �߸��� �ӵ� ����
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		myCar.setSpeed(60);// �ùٸ� �ӵ� ����
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}
