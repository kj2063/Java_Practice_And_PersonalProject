class Book3{// ���赵(������ ����� ���� ����)
	//String title;
	private String title;
	//String author;
	private String author;
	//int price;
	private int price;
	
	Book3(){
		title = "����Ŭ";
		author = "����";
		price = 1000;
	}
	
	Book3(String title){
		this.title = title;
		author = "������";
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


public class Ex05_20_��ü�迭 {
	public static void main(String[] args) {
		Book3 bk1 = new Book3();// ����Ŭ,����,1000
		Book3 bk2 = new Book3("�ڹ�");// �ڹ�, ������, 2000
		Book3 bk3 = new Book3("Html","����",3000);
		
		bk1.display();
		bk2.display();
		bk3.display();
		
		System.out.println();
		
		/*
		Book2[] bk = new Book2[3];
		bk[0] = new Book2();
		bk[1] = new Book2("�ڹ�");
		bk[2] = new Book2("Html","����",3000);
		*/
		
		Book3[] bk = {new Book3(),new Book3("�ڹ�"),new Book3("Html","����",3000)};
		
		for(int i=0; i<bk.length; i++) {
			bk[i].display();
		}
		
		
		/*
		display �޼��� ���
		
		��ü 3�� �迭
		display �޼��� ���
		*/
	}
}
