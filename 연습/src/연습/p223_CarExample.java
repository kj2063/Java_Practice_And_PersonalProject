package 연습;
class car {
	int gas;

	void GasSet(int gas) {
		this.gas = gas; 
	}

	void GasState() {
		if (gas>0) {
			System.out.println("gas가 있습니다.");
			while(gas>0) {
				System.out.printf("달립니다.(gas잔량:%d)\n",gas);
				gas--;
			}
			System.out.println("gas가 없습니다.");
			System.out.println("gas를 주입하세요.");
		} else {
			System.out.println("gas가 없습니다.");
			System.out.println("gas를 주입하세요.");
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
