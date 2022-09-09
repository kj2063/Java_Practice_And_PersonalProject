class Product /*extends Object*/ {//extends Object  : Object�� ��� Ŭ������ ����Ŭ����, �Ƚᵵ �ڵ����� �ۼ���. 
	private String code;
	private String company;
	
	Product(String code, String company){
		//super();//���⼭ super�� Object�� �ǹ�. ���� �ʾƵ� �ڵ����� ����.
		this.code = code;
		this.company = company;
	}
	
	void show() {
		System.out.print(code + " " + company + " ");
	}
}
	
class Computer extends Product{ //�θ� ���� �ڽ��� ���� �� ������, �ϳ��� �ڽ��� ���� �θ� ���� ���� ����.
	String os;
	int ram;
	
	Computer (String code, String company, String os, int ram){
		super(code, company); //�θ��� �ɹ������� private �� ��� �޼��带 ���� ������ �����ϰų� �޴� ����ۿ� ����.
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

public class Ex06_04_��� {
	public static void main(String[] args) {
		
		Computer c = new Computer("111","samsung","windows10",256);//Computer ������ ���� ����
		Book b = new Book("222","LG","JAVA","������");//Book ������ ���� ����
		
		c.show();//��� ���
		b.show();
	}
}
