class Book{// ���赵(������ ����� ���� ����)
	String title;
	String author;
	int price;
}

class Book2{
	String title = "jsp";
	String author = "����";
	int price = 1000;
}

public class Ex05_02_Ŭ���� {
	public static void main(String[] args) {
		
		Book bk1 = new Book();
		Book2 bk = new Book2();

//		bk1.title = "�ڹ�";
//		bk1.author = "������";
//		bk1.price = 3000;
		
		System.out.println(bk1.title); // null -> ���� ������ �ǹ��ϴ� �ܾ�
		System.out.println(bk1.author); // null 
		System.out.println(bk1.price);
		
		System.out.println(bk.title); 
		System.out.println(bk.author); 
		System.out.println(bk.price);

		System.out.println();
		
		bk1.title = "�ڹ�";
		bk1.author = "������";
		bk1.price = 3000;
		
		System.out.println(bk1.title);
		System.out.println(bk1.author);
		System.out.println(bk1.price);
		
		
		
	}
}

