package ����;

class F{
	private String name;
	private int price;
	
	F(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof F) {
			F a = (F)obj;
			if(this.price == a.price) {
				return true;
			} 
		}
		return false;
	}

}

public class Object_equals_overriding {
	public static void main(String[] args) {
		
		F f1 = new F("���",1000);
		F f2 = new F("����",500);
		F f3 = new F("�ٳ���",1000);
		
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		
		
		
	}
}
