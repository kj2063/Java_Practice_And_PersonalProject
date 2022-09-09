import java.util.Scanner;

public class Ex03_03_ifelse_권준 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int music, sci, hist;

		System.out.print("이름 입력:");
		name = sc.next(); 
		System.out.print("음악점수 입력:");
		music = sc.nextInt();
		System.out.print("과학점수 입력:");
		sci = sc.nextInt();
		System.out.print("역사점수 입력:");
		hist = sc.nextInt();

		//합계, 평균(소숫점 아래 2자리) 출력
		int total = music + sci + hist;
		double avg = (double)total/3;
		System.out.printf("총점:%d\n", total);
		System.out.printf("평균:%.2f\n", avg);

		if(avg >= 90) {
			System.out.println("A학점");
		} else if (avg>=80) {
			System.out.println("B학점");
		} else if (avg>=70) {
			System.out.println("C학점");
		} else if (avg>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		} // else if 에 (avg>=80 && avg<90) 가 아닌 (avg>=80)만 넣어도 된다. if문 부터 else if 문 차례로 실행되므로!

		System.out.println("--------------------");

		if(avg>=90) {
			System.out.println("A학점");
		} 
		if(avg>=80 && avg<90) {
			System.out.println("B학점");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C학점");
		} 
		if(avg>=60 && avg<70) {
			System.out.println("D학점");
		}
		if(avg<60) {
			System.out.println("F학점");
		} //모든 if를 확인하므로 비효율적

		System.out.println("--------------------");

		String hakjum = ""; 
		// String hakjum = "F학점"; 
		// String hakjum; 이라고만 선언하면 error 발생.
		// 90점대도 80점대도 아닐때 출력될 "" 또는 "F학점"으로 초기화 해줘야 한다.

		if(avg>=90) {
			hakjum = "A학점";		
			if(avg>=95) {
				hakjum = hakjum + "+";
			} else {
				hakjum = hakjum + "-";
			}
		} else if(avg>=80) {
			hakjum = "B학점";
			if(avg>=85) {
				hakjum = hakjum + "+";
			} else {
				hakjum = hakjum + "-";
			}
		}

		System.out.println(hakjum);

		System.out.println("---------------------");

		// 오늘의 과제
		// switch~case 를 이용하여 평균에 따른 학점 출력
		
		//1
		System.out.println("과제 결과\n");
		System.out.print("+,- 부호 없는 학점 : ");
		
		switch((int)avg/10) {
		case 10:
		case 9:
			System.out.print("A학점");
			break;
		case 8:
			System.out.print("B학점");
			break;
		case 7:
			System.out.print("C학점");
			break;	
		case 6:
			System.out.print("D학점");
			break;
		default:
			System.out.println("F학점");
		}
		
		//2
		System.out.print("\n+,- 부호 있는 학점 : ");
		switch((int)avg/10) {
		case 10:
			System.out.print("A학점+");
			break;
		case 9:
			System.out.print("A학점");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;
		case 8:
			System.out.print("B학점");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;
		case 7:
			System.out.print("C학점");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;	
		case 6:
			System.out.print("D학점");
			if(avg%10>=5)
				System.out.print("+\n");
			else
				System.out.print("-\n");
			break;
		default:
			System.out.println("F학점");
		}
		

	}
}
