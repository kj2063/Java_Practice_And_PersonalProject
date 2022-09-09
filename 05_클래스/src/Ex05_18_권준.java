class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		this.title = "버터";
		this.singer = "BTS";
		this.genre = "발라드";
		this.price = 3000;
	}

	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	String getTitle(){
		return title;
	}
	String getSinger(){
		return singer;
	}
	String getGenre(){
		return genre;
	}
	int getPrice(){
		return price;
	}
	
	public String toString() {
		return title + "," + singer + "," + genre + "," + price ;
	}
	
}

public class Ex05_18_권준 {
	public static void main(String[] args) {
		
//		Music m1 = new Music(); //생성자 통한 초기화("버터","BTS","발라드",3000);
//		Music m2 = new Music("낙하","악뮤","댄스",2000); // 생성자 통한 초기화
//		Music m3 = new Music(); //setter 통한 초기화("어머나","장윤정","트로트",5000)
		
		Music[] m = {new Music(),new Music("낙하","악뮤","댄스",2000),new Music()};
		m[2].setTitle("어머나");
		m[2].setSinger("장윤정");
		m[2].setGenre("트로트");
		m[2].setPrice(5000);
				
		//모두 getter로 출력
		for(Music a: m) {
			System.out.print(a.getTitle() + " ");
			System.out.print(a.getSinger() + " ");
			System.out.print(a.getGenre() + " ");
			System.out.print(a.getPrice() + "\n");
		}
		
		System.out.println();
		
		//toString 메서드 사용
		for(Music a: m) {
			System.out.println(a);
		}
		
	}
}
