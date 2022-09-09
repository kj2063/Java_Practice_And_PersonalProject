class Data2 {
	 int i;
}//

class AA2 extends Thread {
	public void run() {
		for(int i=0; i<100000; i++) {
			synchronized (Ex10_07_SyncTest.d) {// 임계영역 설정: 공유자원이 사용되는 영역 설정 => 공유자원으로 쓰는것 ()안에 쓰기 //다른곳에서 공유자원에 접근하려고 할때 막음.
				Ex10_07_SyncTest.d.i++;
			}
		}
		System.out.println("AA2 i:" + Ex10_07_SyncTest.d.i);
	}
}//

class BB2 extends Thread {
	public void run() {
		for(int i=0; i<100000; i++) {
			synchronized (Ex10_07_SyncTest.d) {//공유자원으로 쓰는것 ()안에 쓰기
				Ex10_07_SyncTest.d.i++;
			}
		}
		System.out.println("BB2 i:" + Ex10_07_SyncTest.d.i);
	}
}//

public class Ex10_07_SyncTest {
	static Data2 d = new Data2();
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		AA2 A = new AA2();
		BB2 B = new BB2();
		
		A.start();
		B.start();
		
		System.out.println("main 종료");
	}
}
