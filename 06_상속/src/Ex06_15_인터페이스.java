interface Camera{
	void takePhoto();
	int a = 1; //public static final int a=1; 
	//인터페이스 안에 들어가는 변수는 public static final이 생략되어도 자동으로 붙어 상수처럼 쓰인다.
	//변경 불가능
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
		System.out.println("음악감상");	
	}
	
	@Override
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	
}

public class Ex06_15_인터페이스 {
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
