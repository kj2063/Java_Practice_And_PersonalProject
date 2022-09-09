
public class Ex03_10_별찍기 {
	public static void main(String[] args) {

		/*
		*
		**
		***
		****
		*****
		*/
		
		int i, j, k;
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------");		
		
		for(i=1;i<=5;i++) {
			for(j=4;j>=i;j--) { //공백출력 반복
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) { //별출력 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		/*
		*****
		 ****
		  ***
		   **
		    *
		 */
		
		for(i=1;i<=5;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(i>j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}			
			}	
			System.out.println();
		}
	
	}
}
