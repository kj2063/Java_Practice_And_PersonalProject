import java.util.Scanner;

public class Ex01_04_입력문 {
	public static void main(String[] args) {
		int a;
		a = 80;
		
		System.out.println("a:" + a);
		
		int kor,eng,math;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름입력:");
		name = sc.next();//스캐너로 읽겠다. 문자열 입력해라 
		/*
		next() :문자열 입력
		nextInt() :정수 입력
		nextFloat() :실수(float) 입력
		nextDoble() :실수(double) 입력
		etc...
		*/
		System.out.print("국어점수 입력:");
		kor = sc.nextInt();// 스캐너로 읽겠다 정수 입력해라 
		
		System.out.print("영어점수 입력:");
		eng = sc.nextInt();// 스캐너로 읽겠다 정수 입력해라
		
		System.out.print("수학점수 입력:");
		math = sc.nextInt();// 스캐너로 읽겠다 정수 입력해라
		
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("math:" + math);
		
		int total = kor + eng + math;
		System.out.println(name + "의 총점수:" + (total));
		
		int avg = total/3;
		System.out.println(name + "의 평균점수:" + (avg));
		double avg2 = (double)total/3; //int type 인 total 이나 3 둘중에 하나를 float 형식으로 바꾸면 avg2 값에 float type 값을 넣을 수 있다.
		//double avg2 = total/3.0 //이것도 가능하다.
		System.out.printf("의 평균(소숫점):%.2f\n",avg2);
	}
}
