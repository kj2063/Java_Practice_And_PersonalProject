class Test2 extends Thread{ //Thread class를 상속받아 멀티쓰레드 만들기
	public void run() {
		for(int i=1; i<=50;i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
}

public class Ex10_02_Thread {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Test2 t2 = new Test2();
		t2.start();// t2.run() 이라고 쓰면 멀티스레드로 돌리는것이 아닌 일반 메서드로 돌리는 것. 
		
		System.out.println("프로그램 종료");
		
	}
}
