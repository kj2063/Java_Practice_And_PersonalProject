class Test1 implements Runnable{ //Runnable �������̽� �����Ͽ� ��Ƽ������ �����

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
}

public class Ex10_01_Thread { //��Ƽ������ : ���ÿ� 2�� �̻��� �޼��尡 ����Ǵ°� 
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Test1 t1 = new Test1();
		Thread th = new Thread(t1); //Runnable �� ��ӹ��� ��ü�� Thread ��ü ������ ���ڷ� �ִ´�.
		
		//t1.start();
		th.start();//Thread��ü ������ ���ڷ� �� ��ü�� run �޼��� ����
		
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println("���α׷� ����");
	}
}
