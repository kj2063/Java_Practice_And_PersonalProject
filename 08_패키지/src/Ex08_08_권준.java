
public class Ex08_08_권준 {
	public static void main(String[] args) {
		
		String[] str = {"민아:70", "크리스탈:90", "아이유:76"};
		
		//세사람 점수의 합계 출력
		System.out.println("1번문제. [세사람의 점수 합계 출력하기]");
		int sum = 0;
		
		for(String a : str) {
			int n =  a.indexOf(":");
			sum += Integer.parseInt(a.substring(n+1));
			//sum += Integer.valueOf(a.substring(n+1));
		}
		System.out.println("1번 답 => 세사람의 점수 합 : " + sum);
		
		System.out.println();
		//2.split 사용
		System.out.println("2번문제. ['split'사용하여 1번문제의 답 구하기]");
		sum = 0;
		String[] sp;
		
		for(String a : str) {
			sp = a.split(":");
			sum += Integer.parseInt(sp[1]);
			//sum += Integer.valueOf(sp[1]);
		}
		System.out.println("2번 답 => 세사람의 점수 합 : " + sum);
		
	}//main
}
