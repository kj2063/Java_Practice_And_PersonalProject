interface Camera{
	void takePhoto();
	int a = 1; //public static final int a=1; 
	//�������̽� �ȿ� ���� ������ public static final�� �����Ǿ �ڵ����� �پ� ���ó�� ���δ�.
	//���� �Ұ���
}

interface MP3{
	void playMp3();
}

interface DMB{
	void viewTv();
}

class Shape2{
	private int size;
	private String color;
		
	public int getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
}

class Phone extends Shape2 implements Camera,MP3{
	
	Phone(int size ,String color){
		super(size,color);
	}
	
	@Override
	public void playMp3() {
		System.out.println("���ǰ���");	
	}
	
	@Override
	public void takePhoto() {
		System.out.println("�������");
	}
	
}

public class Ex06_15_�������̽� {
	public static void main(String[] args) {
		
		Phone p = new Phone(10,"blue"); 
		System.out.println(p.getSize() + " " + p.getColor());
		p.playMp3();
		p.takePhoto();
		
		System.out.println(Phone.a);
		
		final int k;
		k=3;
		
		
	}
}
