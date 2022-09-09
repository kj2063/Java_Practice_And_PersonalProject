
public class Ex03_08_¿Ã¡ﬂforπÆ {
	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=3;i++) {
			for(j=5;j<=7;j++) {
				System.out.println(i+","+j);
			}
			System.out.println("----------------");
		}

		System.out.println("=================");

		/*
		5,1
		5,3
		5,5
		-----
		3,1
		3,3
		3,5
		-----
		1,1
		1,3
		1,5
		*/
		for(i=5;i>0;i-=2) {
			for(j=1;j<=5;j+=2) {
				System.out.printf("%d,%d\n",i,j);
			}
			System.out.println("---------------");
		}
		
		
		
	}
}
