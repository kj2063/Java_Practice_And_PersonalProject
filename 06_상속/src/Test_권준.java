class Vehicle { //Ż��, ����
	private int wheel;
	private String horn;//����
	
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
//	private String horn;//����
	
	boolean hat; //������(true:������, false:�������)
	
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
			return "����";
		else 
			return "������";
	}
	
}//KickBoard

class Taxi extends Vehicle{
//	private int wheel;
//	private String horn;//����

	int door;

	Taxi(int wheel, String horn, int door){
		super(wheel,horn);
		this.door = door;
	}
	
	void display() {
		System.out.println("Taxi ������: " + super.getWheel());
		System.out.println("Taxi �����Ҹ�: " + super.getHorn());
		System.out.println("Taxi �� ��: " + door);
	}
}//Taxi

public class Test_���� { // youn1223@daum.net 12:40�� 1����
	public static void main(String[] args) {
		KickBoard k = new KickBoard(2,"������",true); //ű����
		Taxi t = new Taxi(4,"����",4);
		
		
//		KickBoard: getter 3���� ���
//		Taxi : display �޼��忡�� 3�ٷ� ���

		System.out.println("KickBoard ������: " + k.getWheel());
		System.out.println("KickBoard �����Ҹ�: " + k.getHorn());
		System.out.println("KickBoard ��� ���뿩��: " + k.getHat());
		
		System.out.println();
		
		t.display();
	}
}
