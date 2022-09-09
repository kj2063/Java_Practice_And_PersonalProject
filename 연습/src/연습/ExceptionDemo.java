package 연습;
class DivideException extends IO
 
class calculator {
	int left, right;
	
	public void set_var(int left, int right) {
		this.left = left;
		this.right = right;
	}	
	public void divide() {
		try{ System.out.println(this.left/this.right);
		} catch (ArithmeticException e) {
			System.out.println("에러발생");
		}
	}
}

public class ExceptionDemo {
	public static void main(String[] args) {
		calculator cal = new calculator();
		cal.set_var(10,0);
		cal.divide();
	}
}
