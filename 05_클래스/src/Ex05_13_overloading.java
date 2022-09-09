
public class Ex05_13_overloading {
	public static void main(String[] args) {
		
		star();
		star(7);
		
	}
	
	static void star() {
		System.out.println("*");
	}
	
	static void star(int a) {
		for(int i=1; i<=a; i++)
			System.out.print("*");
		System.out.println();
	}
	
	
	
}
