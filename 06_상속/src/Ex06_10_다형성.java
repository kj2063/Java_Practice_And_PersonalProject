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

public class Ex06_10_������ {
	public static void main(String[] args) {
		
		Car2 car; 
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe; //(Car2)fe �ε� �ڵ����� ��ĳ���� Ÿ�Ժ�ȯ ��.
		System.out.println(car.door); //4
		//System.out.println(car.wheel); //error �߻�
		System.out.println(car.color); //white
		
		System.out.println(fe.door); //6
		System.out.println(fe.wheel); //10
		System.out.println(fe.color); //white
		
		fe.drive();
		car.drive();
		//System.out.println(car.wheel);
		System.out.println();
		
		if(car instanceof FireEngine) { //instanceof ������: Car2 Ÿ�� ��ü car�� FireEngine Ÿ������ �ٿ� ĳ���� �����Ѱ�?
			System.out.println("�ٿ� ĳ���� ����");
		} else {
			System.out.println("�ٿ� ĳ���� �Ұ���");
		}
		
		fe2 = (FireEngine)car; //�ٿ�ĳ����: �θ� -> �ڽ� // ��ĳ������ �� ��ü�� �ٿ�ĳ���� ����
		fe2.water();
		fe2.drive();
		System.out.println(fe2.door);
		System.out.println(fe2.wheel);
	
	}
}
