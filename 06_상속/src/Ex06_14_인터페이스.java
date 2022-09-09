
interface Copymachine{
	//abstract void copy(); 라고 써야하지만 인터페이스는 추상메서드만 올 수 있으므로 abstract를 생략해도 자동으로 붙여준다.
	//인터페이스에 들어오는 메서드는 자동으로 'public' 'abstract' 가 생략되어있다!
	void copy(); //public abstract void copy();
}//

interface Printmachine{
	void print();
}//

interface Faxmachine{
	void fax();
}//

class Compound implements Copymachine,Printmachine,Faxmachine{
	public void copy() {
		System.out.println("복사한다.");
	}
	public void print() {
		System.out.println("프린트한다.");
	}
	public void fax() {
		System.out.println("팩스 보낸다.");
	}
}//

public class Ex06_14_인터페이스 {
	public static void main(String[] args) {
		//new Copymachine(); // 인터페이스로 객체 생성 못한다.

		Compound c = new Compound();
		c.copy();
		c.print();
		c.fax();
	}
}
/*
//추상클래스 : 완성된메서드와 추상메서드 같이 있어도 됨.
abstract class

//인터페이스 : 추상메서드만 있
interface ~
*/