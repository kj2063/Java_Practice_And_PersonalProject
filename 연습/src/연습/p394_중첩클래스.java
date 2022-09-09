package 연습;

class AA_ {
	AA_(){System.out.println("클래스 AA_ 생성됨");}
	
	int field1 = 0;
	static int field2 = 0;
	void method1() {System.out.println("AA_ method1 실행");}
	static void method2() {System.out.println("AA_ method2 실행");}
	
	class BB{
		BB(){System.out.println("클래스 BB(instance member class) 생성됨");}
		
		int field1 = 1;
		static int field2 = 2 ;
		void method1() {System.out.println("BB클래스(instance class) method1 실행");}
		static void method2() {System.out.println("BB클래스(instance member class) method2 실행");}
	
	
	}
	
	static class CC {
		CC(){System.out.println("클래스 CC(static member class) 생성됨");}
		
		int field1 = 3;
		static int field2 = 4;
		void method1() {System.out.println("CC클래스(static member class) method1 실행");}
		static void method2() {System.out.println("CC클래스(static member class) method2 실행");}
	}
	
	void method(){
		class DD {
			DD(){System.out.println("클래스 DD(local class) 생성됨");}
			
			int field1 = 5;
			static int field2 = 6;
			void method1() {System.out.println("BB클래스(local class) method1 실행");}
			static void method2() {System.out.println("BB클래스(local class) method2 실행");}
		}
	}
}

public class p394_중첩클래스 {
	public static void main(String[] args) {
		AA_ a = new AA_();
		System.out.println(a.field1);
		System.out.println(AA_.field2);
		a.method1();
		AA_.method2();
		
		System.out.println();
		
		AA_.BB b = a.new BB();
		System.out.println(b.field1);
		System.out.println(AA_.BB.field2);
		b.method1();
		AA_.BB.method2();
		
		System.out.println();
		
		AA_.CC c = new AA_.CC();
		System.out.println(c.field1);
		System.out.println(AA_.CC.field2);
		c.method1();
		AA_.CC.method2();
		
		System.out.println();
		
		a.method();
		
		System.out.println(a.field1);
		
	
	}
}
