package 연습;

class AA_1{
	class BB{} // AA_1 객체가 만들어져야 BB객체 만들 수 있음
	static class CC{}
	
	BB field1 = new BB();
	CC field2 = new CC();
	
	void method1() {
		BB var1 = new BB();
		CC var2 = new CC();
	}
	
	//static BB field3 = new BB(); //error 발생
	static CC field4 = new CC();
	
	static void method2() {//AA_1 객체 없이 method 생성
		//BB var1 = new BB(); //error 발생 : AA_1 객체가 생성되지 않은면 BB 객체를 만들 수 없으므로
		AA_1 var = new AA_1();
		var.BB var1 = var.new BB();//따라서 이렇게는 생성되는 듯...
			
		CC var2 = new CC();
	}

}

public class p396_중첩클래스_접근제한 {
	
}
