class Fruit{
	
	void apple() {
		System.out.println("apple");
	}
	static void banana() {
		System.out.println("banana");
	}
}
//------------------------------------------	

public class Ex05_05_���� {
	public static void main(String[] args) {
		
		System.out.println("main �޼���");
		//������ ȣ���غ���, ��¹� 5�� �� �������ϱ�
		Fruit f = new Fruit();
		f.apple();
		Fruit.banana();
		
		Ex05_05_���� o = new Ex05_05_����();
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
