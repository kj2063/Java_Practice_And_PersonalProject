import java.util.Scanner;

public class Ex03_15_권준 {
	public static void main(String[] args) {
		
		//수입력 아무거나~, 음수를 입력할때까지 계속 입력, 음수를 입력하면 음수 입력 전까지의 합계 나오게 하기.
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("수 입력:");//수입력
			num = sc.nextInt();
			if (num>0)
				sum += num;
			else
				break;			//입력한 숫자가 음수이면 반복문 빠져나가기
		}
		System.out.printf("\n지금까지 입력한 양수의 합:%d",sum);
	}
}
