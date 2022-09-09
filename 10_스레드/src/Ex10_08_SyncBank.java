class Bank{
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void saveMoney(int save) { //메서드에 synchronized 하여 한번 실행될시 다른 스레드에서의 saveMoney 메서드의 접근을 막음
		money = money + save;
	}
	
}//Bank

class Park extends Thread{
	public void run() {
		Ex10_08_SyncBank.bk.saveMoney(3000);
		System.out.println("Park saveMoney(3000) : " + Ex10_08_SyncBank.bk.getMoney());
	}
}//Park

class Kim extends Thread{	
	public void run() {
		Ex10_08_SyncBank.bk.saveMoney(500);
		System.out.println("Kim saveMoney(500) : " + Ex10_08_SyncBank.bk.getMoney());
	}
	
}//Kim

public class Ex10_08_SyncBank {
	
	static Bank bk = new Bank();
	
	public static void main(String[] args) {
		
		System.out.println("원금 : " + bk.getMoney() + "원");
		
		Park p = new Park();
		Kim k = new Kim();
		p.start();
		k.start();
		
		
		
		
		
	}
}
