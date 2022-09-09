class Book{// 설계도(공간이 만들어 지진 않음)
	String title;
	String author;
	int price;
}

class Book2{
	String title = "jsp";
	String author = "수영";
	int price = 1000;
}

public class Ex05_02_클래스 {
	public static void main(String[] args) {
		
		Book bk1 = new Book();
		Book2 bk = new Book2();

//		bk1.title = "자바";
//		bk1.author = "아이유";
//		bk1.price = 3000;
		
		System.out.println(bk1.title); // null -> 값이 없음을 의미하는 단어
		System.out.println(bk1.author); // null 
		System.out.println(bk1.price);
		
		System.out.println(bk.title); 
		System.out.println(bk.author); 
		System.out.println(bk.price);

		System.out.println();
		
		bk1.title = "자바";
		bk1.author = "아이유";
		bk1.price = 3000;
		
		System.out.println(bk1.title);
		System.out.println(bk1.author);
		System.out.println(bk1.price);
		
		
		
	}
}

