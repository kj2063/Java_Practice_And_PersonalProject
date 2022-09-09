
public class Ex02_04_관계논리 {
	public static void main(String[] args) {
		
		int a=10, b=20;
		
		boolean c = a > b;
		System.out.println("c:" + c);
		
		c = !(a>b); //!false
		//!false : true
		//!true : false
		System.out.println("c:" + c);
		
		c = a == b;
		System.out.println("c:" + c);

		c = a != b;
		System.out.println("c:" + c);
		System.out.println(a != b);
		
		c = a >= 5 && b>=5; //true & true -> true
		System.out.println("c:" + c);
	
		c = a >= 20 && b>=20; //false & true -> false
		System.out.println("c:" + c);

		c = a >= 20 || b>=20; //false or true -> true
		System.out.println("c:" + c);
			
	}
}
