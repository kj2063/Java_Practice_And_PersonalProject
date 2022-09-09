class Big implements Runnable{
	
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();//궂이 안써도 되는데 자동완성 기능을 사용하면 자동으로 만들어진다.
			}

		}		
	}
	
}

class Small extends Thread{
	
	public void run() {
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i + " ");
			try {//Small이 Thread를 상속받으므로 static 메서드인 sleep()을 sleep();으로 바로 쓸 수 있다.
				sleep(100);// InterruptedException : RuntimeException을 상속받는 Exception은 예외처리가 필수는 아니지만 , 상속받지 않는 예외는 예외처리가 필수 이다.
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}//for	
	}
	
}


public class Ex10_03_Thread {
	public static void main(String[] args) {
		
		Big b = new Big();
		Thread tb = new Thread(b);
		
		Small ts = new Small();
		
		System.out.println("프로그램 시작");

		tb.start();
		ts.start();
		
		System.out.println("프로그램 종료");
		
	}
}
