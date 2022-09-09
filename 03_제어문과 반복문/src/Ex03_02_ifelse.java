import java.util.Scanner;

public class Ex03_02_ifelse {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		num = sc.nextInt();
		
		//if(num==1 || num==2 || num==3 || ... || num==10){}
		if(num>=1 && num<=10 && num!=3) { //1~10 사이 수 중에 3이 아닌수
			System.out.println("1~10사이의 숫자 but 3이 아니다.");
		}
		//or if (num>=1 && num<=10){ if (num!=3){ } } 이와 같이 if 문 안에 if 문을 넣어 처리 할 수 도 있다.
		
		System.out.println("if~else 공부중");
		System.out.println("----------------------");
		
		if(num>=1 && num<=10) {
			System.out.println("1~10사이의 숫자");
		} else if (num>=11 && num<=20) {
			System.out.println("11~20사이의 숫자");
		} else if (num>=21 && num<=30) {
			System.out.println("21~30사이의 숫자");
		}
		
		// 모든 조건을 확인해 봐야 할때는 if 문으로만 코드를 짠다.
		
		System.out.println("if~else 공부중");
		
		if(num%5 == 0) {
			System.out.println("5의 배수");
		}	
		if(num%10 == 0) {
			System.out.println("10의 배수");
		}
		
		
	}
}
