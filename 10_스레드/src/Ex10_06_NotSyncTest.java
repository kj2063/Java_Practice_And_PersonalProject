class Data {
	int i;
}//

class AA extends Thread {
	public void run() {
		for(int i=0; i<100000; i++) {
			Ex10_06_NotSyncTest.d.i++;
		}
		System.out.println("BB i:" + Ex10_06_NotSyncTest.d.i);
	}
}//

class BB extends Thread {
	public void run() {
		for(int i=0; i<100000; i++) {
			Ex10_06_NotSyncTest.d.i++;
		}
		System.out.println("BB i:" + Ex10_06_NotSyncTest.d.i);
	}
}//

public class Ex10_06_NotSyncTest {
	
	static Data d = new Data();
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		AA A = new AA();
		BB B = new BB();
		
		A.start();
		B.start();
		
		System.out.println("main 종료");
	}
}
