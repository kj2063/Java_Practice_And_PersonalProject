

public class Ex07_04_throw {
	public static void main(String[] args) {
		try {
			call();
			System.out.println("정상처리 되었습니다.");
		}
		catch(Exception e) {
			System.out.println("call에서 처리중 예외처리 되었습니다.");
		}
		
	}//main
	
	static void call() {
		try {
			int num = 3/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("call 메서드에서 예외 발생");
			throw e; // 에러를 return 한다고 생각하면 편할듯.
		}
	}
	
}
