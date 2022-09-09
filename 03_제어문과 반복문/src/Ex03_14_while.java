
public class Ex03_14_while {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		i=1;
		while(true) {
			System.out.println(i);
			if(i==5)
				break;
			i++;
		}
		
		System.out.println("¿©±â");
		
	}
}
