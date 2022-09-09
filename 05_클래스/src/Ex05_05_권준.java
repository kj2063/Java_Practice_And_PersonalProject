class Fruit{
	
	void apple() {
		System.out.println("apple");
	}
	static void banana() {
		System.out.println("banana");
	}
}
//------------------------------------------	

public class Ex05_05_권준 {
	public static void main(String[] args) {
		
		System.out.println("main 메서드");
		//모든것을 호출해보기, 출력문 5줄 다 나오게하기
		Fruit f = new Fruit();
		f.apple();
		Fruit.banana();
		
		Ex05_05_권준 o = new Ex05_05_권준();
		o.orange();
		melon();
	}

//------------------------------------------	
	void orange() {
		System.out.println("orange");
	}
	
	static void melon() {
		System.out.println("melon");
	}
}
