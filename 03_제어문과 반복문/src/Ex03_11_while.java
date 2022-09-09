
public class Ex03_11_while {
	public static void main(String[] args) {
				
		for(int i=1;i<=5;i++)
			System.out.printf("Hello%d\n",i);
		
		System.out.println();
		
		int i = 1;
		while(i<=5) {
			System.out.printf("Hello%d\n",i);
			i++;
		}
		System.out.println("while 문 밖_\"i값 출력\" :" + i);
	
		
		// while문 써서 10 9 8.. 출력
		
		i=10;
		while(i>=1) {
			System.out.printf("%d ",i);
			i--;
		}
		//while과 비슷한 do~while문이 있다.
		/*
		초기식;
		do {
			반복할 문장;
		} while(조건식);
		*/
		System.out.println("\n------------------");
		System.out.println();
		
		i=1;
		do { // while과 다른점. 적어도 한번은 문장을 실행한다.
			System.out.println("Hello"+ i);
			i++;
		} while(i<6);
		
		System.out.println("do~while문 밖_\"i값 출력\"" + i);
	}
}
