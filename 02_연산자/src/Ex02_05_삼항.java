/*
단항연산자 : 피연산자가 1개
ex) -3,+9,++a,a--, !false ...

이항연산자 : 피연산자가 2개
ex) 3+4,7-2,3*2, ... 
*,/,%,&&,||,!=,+= etc...

삼항연산자 : 피연산자가 3개 (딱 하나 있다)
ex)x ? y : z => 조건연산자
조건식 ? 참일때 실행할 문장 : 거짓일때 실행할 문장

*/
public class Ex02_05_삼항 {
	public static void main(String[] args) {
		int a=10, b=20;
		
		//형식 => 조건식 ? 참일때 실행할 문장 : 거짓일때 실행할 문장
		int result = a > b ? a : b; //a도 b도 int 이므로 result변수도 int 로 해야함
		System.out.println("result:" + result); //20 즉 거짓임을 의미 
		
		//a변수 값이 짝수면 짝수라고 출력
		//a변수 값이 홀수면 홀수라고 출력
		String res = (a%2 == 0)? "짝수" : "홀수";
		System.out.println("a값은 짝수? 홀수? :" + res);
	}
}

