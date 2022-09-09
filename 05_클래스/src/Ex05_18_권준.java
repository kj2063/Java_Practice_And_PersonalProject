class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		this.title = "����";
		this.singer = "BTS";
		this.genre = "�߶��";
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

public class Ex05_18_���� {
	public static void main(String[] args) {
		
//		Music m1 = new Music(); //������ ���� �ʱ�ȭ("����","BTS","�߶��",3000);
//		Music m2 = new Music("����","�ǹ�","��",2000); // ������ ���� �ʱ�ȭ
//		Music m3 = new Music(); //setter ���� �ʱ�ȭ("��ӳ�","������","Ʈ��Ʈ",5000)
		
		Music[] m = {new Music(),new Music("����","�ǹ�","��",2000),new Music()};
		m[2].setTitle("��ӳ�");
		m[2].setSinger("������");
		m[2].setGenre("Ʈ��Ʈ");
		m[2].setPrice(5000);
				
		//��� getter�� ���
		for(Music a: m) {
			System.out.print(a.getTitle() + " ");
			System.out.print(a.getSinger() + " ");
			System.out.print(a.getGenre() + " ");
			System.out.print(a.getPrice() + "\n");
		}
		
		System.out.println();
		
		//toString �޼��� ���
		for(Music a: m) {
			System.out.println(a);
		}
		
	}
}
