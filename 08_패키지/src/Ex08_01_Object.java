class Fruit{ //class Fruit extends Object ������ ������ ����. but ������.
	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	//@Overriding
	public String toString() {//������ ������� ��ü�� �ּҸ� retrun �ϴ� ����� ���� ������, overriding �ؼ� String ���� retrun �ϰ� �ٲ�.
		return name+ ", " +price; 
	}
	
	//@Overriding
	public boolean equals(Object obj) { //Object obj = new Fruit(); // equals(Fruit this, Object obj){}�ε� Fruit this�� �����Ǿ� �ִ�. ���� �ȵȴ�.
		//this : f1, obj : f2
		if(obj instanceof Fruit) {
			Fruit ft = (Fruit)obj;
			if(this.price == ft.price && this.name.equals(ft.name)){//obj.price �� �ڽĸ� price�� ���� �ְ� Object�� ���� ���� �ʱ� ������ obj.price�� ��� ���� ���Ѵ�.
				return true;
			}				
		}	
		return false;
	}

	
	
}


public class Ex08_01_Object {
	public static void main(String[] args) {
		/*
		Fruit a = new Fruit("apple",1000);
		Fruit b = new Fruit("apple",1000);
		Fruit c = new Fruit("apple",1000);
		*/
		
		Fruit[] f_arr = {new Fruit("apple",1000), new Fruit("banana",500), new Fruit("peach", 1500)};
		for(Fruit f: f_arr) {
			System.out.println(f);
		}
		
		boolean b1 = f_arr[0].equals(f_arr[1]); //f_arr[0]�� f_arr[1]�� �ּҰ� ������ �ٸ��� Ȯ���ϴ� �޼��� .equals()
		System.out.println(b1); 
		/*
		class Object{
			public boolean equals(Object obj){ //Object�� �ڽ��̸� ���� ���� �� �ִ�.
			...
			}
		}
		*/
				
		
	}
}
