import java.util.Scanner;

public class Ex03_06_for {
	public static void main(String[] args) {

		/*
		for(초기식;조건식;증감식) { 
			반복할 문장1;
			반복할 문장2; 
		}
		 */

		int i;
		//System.out.println("자바 공부중"); * 5
		for (i=1; i<=5; i++) {
			System.out.println("자바 공부중 for: " + i);
		}

		System.out.println("for문 밖: " + i);

		//54321
		for (i=5; i>=1; i--) { // i-- 대신 i=i-1 or i-=1 도 된다.
			System.out.println("for문 공부중: " + i);
		}

		
		System.out.println("-------------------");

		
		for (i=2;i<=10;i=i+2) {
			System.out.println("오늘은 목요일:" + i);
		}

		
		System.out.println("--------------------");

		
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("sum:" + sum);

		sum = 0;
		for (i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);

		
		System.out.println("---------------------");

		
		//1~100까지의 합 구하기
		int sum1 = 0; //짝수일때의 합
		int sum2 = 0; //홀수일때의 합

		for(i=1;i<=100;i++) {
			if(i%2==0)
				sum1 += i;
			else
				sum2 += i;
		}

		System.out.println("1~100 사이의 수 중 짝수의 합: " + sum1);
		System.out.println("1~100 사이의 수 중 홀수의 합: " + sum2);

		//1~100사의의 수중 5의 배수 이면서 7의 배수인 수
		sum = 0;
		for(i=1;i<=100;i++)
			if (i%7==0) // if문은 두번 사용하지 않고 if(i%7==0 && i%5==0) 을 사용해도 좋다. 
				if(i%5==0) {
					sum += i;
					System.out.println(i);
				}	
		System.out.println("1~100사의의 수중 5 and 7의 배수인 수의 합: " + sum);

		
		System.out.println("------------------");


		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력:");
		int num = sc.nextInt();

		for(i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",num,i,(num*i));
		}
		
		

	}	
}
