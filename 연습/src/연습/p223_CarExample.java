package ����;
class car {
	int gas;

	void GasSet(int gas) {
		this.gas = gas; 
	}

	void GasState() {
		if (gas>0) {
			System.out.println("gas�� �ֽ��ϴ�.");
			while(gas>0) {
				System.out.printf("�޸��ϴ�.(gas�ܷ�:%d)\n",gas);
				gas--;
			}
			System.out.println("gas�� �����ϴ�.");
			System.out.println("gas�� �����ϼ���.");
		} else {
			System.out.println("gas�� �����ϴ�.");
			System.out.println("gas�� �����ϼ���.");
		}
		//	
		//	void GasState(int gas) {
		//		
		//	}
		//	
	}
}



class p223_CarExample {
	public static void main(String[] args) {
		
		car mycar = new car();
		mycar.GasSet(5);
		mycar.GasState();
		
	}
}
