import java.util.Scanner;

class Student {
	String name;
	int kor, eng, math;
	
//합계를 리턴하는 sum 메서드 정의
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
//평균을 리턴하는 avg 메서드 정의
	static double avg(int a, int b, int c) {
		return (a+b+c)/(double)3;
	}
	
}


public class Ex05_06_권준 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.print("이름:");
		std.name = sc.next();
		System.out.print("국어 점수:");
		std.kor = sc.nextInt();
		System.out.print("영어 점수:");
		std.eng = sc.nextInt();
		System.out.print("수학 점수:"); //입력받아서 student class에 입력하고 최종출력해보기
		std.math = sc.nextInt();
		
		/*
		System.out.println(이름:);
		System.out.println(국어);
		System.out.println(영어);
		System.out.println(수학);

		System.out.println("합계 : ");
		System.out.println("평균 : ");
		*/
		System.out.println("------출력------");
		System.out.println("이름 = " + std.name);
		System.out.println("국어점수 = " + std.kor);
		System.out.println("영어점수 = " + std.eng);
		System.out.println("수학점수 = " + std.math);
		System.out.println();
		System.out.println("합계 = " + Student.sum(std.kor, std.eng, std.math));
		System.out.printf("평균 = %.2f",Student.avg(std.kor, std.eng, std.math));
		
		
	}
}
