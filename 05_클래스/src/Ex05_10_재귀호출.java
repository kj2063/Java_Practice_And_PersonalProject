
public class Ex05_10_재귀호출 {
	public static void main(String[] args) {
		//재귀 호출 사용하여 4!(팩토리얼) 값 구하기
		
		System.out.println("4 factorial : " + fact(4));
	}
	
	static int fact(int f) {
		if (f == 1)
			return 1;
		else
			return f*fact(--f);
	}
	 
	
	
}
