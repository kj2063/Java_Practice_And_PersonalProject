package CH6_Ȯ�ι���;

public class Account1 {
	private int balance;
		
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int value){
		if (0<value && value<1000000)
			balance = value;	
	}
		
}
