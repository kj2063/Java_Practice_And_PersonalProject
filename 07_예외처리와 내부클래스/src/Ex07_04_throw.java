

public class Ex07_04_throw {
	public static void main(String[] args) {
		try {
			call();
			System.out.println("����ó�� �Ǿ����ϴ�.");
		}
		catch(Exception e) {
			System.out.println("call���� ó���� ����ó�� �Ǿ����ϴ�.");
		}
		
	}//main
	
	static void call() {
		try {
			int num = 3/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("call �޼��忡�� ���� �߻�");
			throw e; // ������ return �Ѵٰ� �����ϸ� ���ҵ�.
		}
	}
	
}
