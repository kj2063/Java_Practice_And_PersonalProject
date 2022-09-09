import java.util.Scanner;

public class Ex01_05_입력문 {
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		/*삼각형의 밑변의 길이 입력
		삼각형의 높이 입력
		삼각형의 면적: 1/2 * 밑변 * 높이
		삼각형의 면적은 ~ 입니다.*/
		double height;
		double base_line;
		
		System.out.print("삼각형의 밑변의 길이 입력:");
		base_line = sc.nextDouble();
		
		System.out.print("삼각형의 높이 입력:");
		height = sc.nextDouble();
		
		double area = .5 * height * base_line;// .5를 1/2롤 사용할때 주의해야할 점. 정수/정수 이므로 0이 된다. 1.0/2 or 1/2.0을 사용해도 된다.
		System.out.printf("삼각형의 면적은 %f입니다.",area);
		
		
	}
}
