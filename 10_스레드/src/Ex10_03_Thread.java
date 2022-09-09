class Big implements Runnable{
	
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();//���� �Ƚᵵ �Ǵµ� �ڵ��ϼ� ����� ����ϸ� �ڵ����� ���������.
			}

		}		
	}
	
}

class Small extends Thread{
	
	public void run() {
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i + " ");
			try {//Small�� Thread�� ��ӹ����Ƿ� static �޼����� sleep()�� sleep();���� �ٷ� �� �� �ִ�.
				sleep(100);// InterruptedException : RuntimeException�� ��ӹ޴� Exception�� ����ó���� �ʼ��� �ƴ����� , ��ӹ��� �ʴ� ���ܴ� ����ó���� �ʼ� �̴�.
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
		
		System.out.println("���α׷� ����");

		tb.start();
		ts.start();
		
		System.out.println("���α׷� ����");
		
	}
}
