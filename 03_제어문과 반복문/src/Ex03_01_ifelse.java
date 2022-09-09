import java.util.Scanner;

public class Ex03_01_ifelse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("a값 입력:");
		a = sc.nextInt();
		System.out.print("b값 입력:");
		b = sc.nextInt();
		
		//a가 더 크면 a를 출력 b가 더 크면 b를 출력
		if(a>b) {
			System.out.println("a가 더 크다");
		} else {
			System.out.println("b가 더 크다");
		}
		
		System.out.println("--------------------");
		
		if(a>b) {
			System.out.println("a가 더 크다");
			System.out.println("하하하");
		} else if(a<b) {
			System.out.println("b가 더 크다");
			System.out.println("헤헤헤");
		} else {// 그렇지 않으면(a==b)
			System.out.println("a와 b는 같다");
			System.out.println("호호호");
		}
		// 중괄호 안의 명령문인 1줄인 경우 중괄호를 안써도 괜찮다.
		// if else 구문에 처리할 것이 없으면 그냥 pass
		
		System.out.println("if~else 공부중");
		
	}
}
