class Data2 {
	 int i;
}//

class AA2 extends Thread {
	public void run() {
		for(int i=0; i<100000; i++) {
			synchronized (Ex10_07_SyncTest.d) {// �Ӱ迵�� ����: �����ڿ��� ���Ǵ� ���� ���� => �����ڿ����� ���°� ()�ȿ� ���� //�ٸ������� �����ڿ��� �����Ϸ��� �Ҷ� ����.
				Ex10_07_SyncTest.d.i++;
			}
		}
		System.out.println("AA2 i:" + Ex10_07_SyncTest.d.i);
	}
}//

class BB2 extends Thread {
	public void run() {
		for(int i=0; i<100000; i++) {
			synchronized (Ex10_07_SyncTest.d) {//�����ڿ����� ���°� ()�ȿ� ����
				Ex10_07_SyncTest.d.i++;
			}
		}
		System.out.println("BB2 i:" + Ex10_07_SyncTest.d.i);
	}
}//

public class Ex10_07_SyncTest {
	static Data2 d = new Data2();
	public static void main(String[] args) {
		
		System.out.println("main ����");
		AA2 A = new AA2();
		BB2 B = new BB2();
		
		A.start();
		B.start();
		
		System.out.println("main ����");
	}
}
