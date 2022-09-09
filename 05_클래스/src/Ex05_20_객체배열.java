class Book3{// 설계도(공간이 만들어 지진 않음)
	//String title;
	private String title;
	//String author;
	private String author;
	//int price;
	private int price;
	
	Book3(){
		title = "오라클";
		author = "수지";
		price = 1000;
	}
	
	Book3(String title){
		this.title = title;
		author = "아이유";
		price = 2000;
	}
	
	Book3(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println(title +" "+ author+" "+ price);
	}
}


public class Ex05_20_객체배열 {
	public static void main(String[] args) {
		Book3 bk1 = new Book3();// 오라클,수지,1000
		Book3 bk2 = new Book3("자바");// 자바, 아이유, 2000
		Book3 bk3 = new Book3("Html","웬디",3000);
		
		bk1.display();
		bk2.display();
		bk3.display();
		
		System.out.println();
		
		/*
		Book2[] bk = new Book2[3];
		bk[0] = new Book2();
		bk[1] = new Book2("자바");
		bk[2] = new Book2("Html","웬디",3000);
		*/
		
		Book3[] bk = {new Book3(),new Book3("자바"),new Book3("Html","웬디",3000)};
		
		for(int i=0; i<bk.length; i++) {
			bk[i].display();
		}
		
		
		/*
		display 메서드 출력
		
		객체 3개 배열
		display 메서드 출력
		*/
	}
}
