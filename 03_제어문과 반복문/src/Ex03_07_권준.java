import java.util.Scanner;

public class Ex03_07_권준 {
	public static void main(String[] args) {
		
		//1. A~Z까지 for문 사용해서 출력 65~90
		System.out.println("문제 1.");
		
		int i;
		for(i=65;i<=90;i++) {
			System.out.print((char)i);
		}
		
		
		//2. 정수 입력 받아서 1~입력받은숫자 까지의 7의배수의 갯수는 몇개? and 7의 배수들의 합계
		System.out.println("\n\n문제 2.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		for(i=1;i<=num;i++) {
			if(i%7==0) {
				count += 1;
				sum += i;
			}
		}

		System.out.println("7의 배수의 갯수: " + count);
		System.out.println("7의 배수의 합: " + sum);

	}
}
