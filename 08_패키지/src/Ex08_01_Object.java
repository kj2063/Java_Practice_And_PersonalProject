class Fruit{ //class Fruit extends Object 원래는 다음과 같음. but 생략됨.
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
	public String toString() {//원래는 만들어진 객체에 주소를 retrun 하는 기능을 갖고 있지만, overriding 해서 String 값을 retrun 하게 바꿈.
		return name+ ", " +price; 
	}
	
	//@Overriding
	public boolean equals(Object obj) { //Object obj = new Fruit(); // equals(Fruit this, Object obj){}인데 Fruit this는 생략되어 있다. 쓰면 안된다.
		//this : f1, obj : f2
		if(obj instanceof Fruit) {
			Fruit ft = (Fruit)obj;
			if(this.price == ft.price && this.name.equals(ft.name)){//obj.price 는 자식만 price를 갖고 있고 Object는 갖고 있지 않기 때문에 obj.price는 사용 하지 못한다.
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
		
		boolean b1 = f_arr[0].equals(f_arr[1]); //f_arr[0]과 f_arr[1]의 주소가 같은지 다른지 확인하는 메서드 .equals()
		System.out.println(b1); 
		/*
		class Object{
			public boolean equals(Object obj){ //Object의 자식이면 뭐든 넣을 수 있다.
			...
			}
		}
		*/
				
		
	}
}
