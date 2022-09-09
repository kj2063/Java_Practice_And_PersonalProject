import java.util.Scanner;
public class Ex07_05_숫자맞추기 {
	public static void main(String[] args) {
		
		/*
		Math.random() : 0 <= result < 1 인값을 출력 
		 
		int d = (int)(Math.random()*15)+25;
		//25~39 정수 난수 발생 => 39 -25 +1 =15 
		
		int d = (int)(Math.random()*38) +100;
		//100~137 정수 난수 발생 => 137 -100 +1 =	38	
		*/
		
		int answer = (int)(Math.random()*100) +1;
		//1~100 정수 난수 발생
		
//		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.print("1~100의 값을 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			
			} catch(Exception e) {
				System.out.println("유효하지 않은 값이 입력됐습니다. 다시 입력하세요.");
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("맞췄습니다.");
				System.out.printf("시도한 횟수는 %d번 입니다.",count);
				break;
			}
		} while(true);
		
			
		
		
	}
}
