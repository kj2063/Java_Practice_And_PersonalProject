class Test2 extends Thread{ //Thread class�� ��ӹ޾� ��Ƽ������ �����
	public void run() {
		for(int i=1; i<=50;i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
}

public class Ex10_02_Thread {
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		Test2 t2 = new Test2();
		t2.start();// t2.run() �̶�� ���� ��Ƽ������� �����°��� �ƴ� �Ϲ� �޼���� ������ ��. 
		
		System.out.println("���α׷� ����");
		
	}
}
