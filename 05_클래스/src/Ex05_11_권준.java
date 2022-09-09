import java.util.Scanner;
	
public class Ex05_11_권준 { //재귀호출
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1: ");//입력
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");//입력
		int num2 = sc.nextInt();
		
		System.out.printf("%d^%d = %d",num1,num2,mul_method(num1,num2));
		//2 와 4가 입력된경우 2의 4승 구하기
	}
	
	static int mul_method(int a,int b) {
		if(b==1)
			return a;
		else
			return a*mul_method(a,--b);
	}
	
}	
