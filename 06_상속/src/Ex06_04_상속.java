class Product /*extends Object*/ {//extends Object  : Object는 모든 클래스의 조상클래스, 안써도 자동으로 작성됨. 
	private String code;
	private String company;
	
	Product(String code, String company){
		//super();//여기서 super은 Object를 의미. 쓰지 않아도 자동으로 있음.
		this.code = code;
		this.company = company;
	}
	
	void show() {
		System.out.print(code + " " + company + " ");
	}
}
	
class Computer extends Product{ //부모가 여러 자식을 갖을 수 있지만, 하나의 자식이 여러 부모를 가질 수는 없다.
	String os;
	int ram;
	
	Computer (String code, String company, String os, int ram){
		super(code, company); //부모의 맴버변수가 private 일 경우 메서드를 통해 변수를 수정하거나 받는 방법밖에 없다.
		this.os = os;
		this.ram = ram;
	}
	
	void show() {
		super.show();
		System.out.println(os + " " + ram);
	}
	
}

class Book extends Product {
	String title;
	String author;
	
	Book(String code, String company, String title, String author) {
		super(code,company);
		this.title = title;
		this.author = author;
	}
	
	void show() {
		super.show();
		System.out.println(title + " " + author);
	}
}

public class Ex06_04_상속 {
	public static void main(String[] args) {
		
		Computer c = new Computer("111","samsung","windows10",256);//Computer 생성자 통한 주입
		Book b = new Book("222","LG","JAVA","아이유");//Book 생성자 통한 주입
		
		c.show();//모두 출력
		b.show();
	}
}
