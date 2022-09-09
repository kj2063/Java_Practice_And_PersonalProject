package ����;

class AA_ {
	AA_(){System.out.println("Ŭ���� AA_ ������");}
	
	int field1 = 0;
	static int field2 = 0;
	void method1() {System.out.println("AA_ method1 ����");}
	static void method2() {System.out.println("AA_ method2 ����");}
	
	class BB{
		BB(){System.out.println("Ŭ���� BB(instance member class) ������");}
		
		int field1 = 1;
		static int field2 = 2 ;
		void method1() {System.out.println("BBŬ����(instance class) method1 ����");}
		static void method2() {System.out.println("BBŬ����(instance member class) method2 ����");}
	
	
	}
	
	static class CC {
		CC(){System.out.println("Ŭ���� CC(static member class) ������");}
		
		int field1 = 3;
		static int field2 = 4;
		void method1() {System.out.println("CCŬ����(static member class) method1 ����");}
		static void method2() {System.out.println("CCŬ����(static member class) method2 ����");}
	}
	
	void method(){
		class DD {
			DD(){System.out.println("Ŭ���� DD(local class) ������");}
			
			int field1 = 5;
			static int field2 = 6;
			void method1() {System.out.println("BBŬ����(local class) method1 ����");}
			static void method2() {System.out.println("BBŬ����(local class) method2 ����");}
		}
	}
}

public class p394_��øŬ���� {
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
