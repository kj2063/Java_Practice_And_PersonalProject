abstract class Employee2{
	private String empno;
	private String name;
	private int pay;
	
	Employee2(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	abstract double getMonthPay();
	
	String print() {
		return empno + " " + name + " " + pay;
	}
	
	int getPay() {
		return pay;
	}
}//

class FullTime extends Employee2{
	private int bonus;
	
	FullTime(String empno, String name, int pay, int bonus){
		super(empno,name,pay);
		this.bonus = bonus;
	}
	
	double getMonthPay() {
		return (super.getPay()/(double)12) + (bonus/(double)12);
	}
	
	String print() {
		return super.print() + " " + bonus;
	}
}//

class Contract extends Employee2{
	private int hireYear;
	
	double getMonthPay() {
		return super.getPay()/(double)12*hireYear; 
	}
	
	Contract(String empno, String name, int pay, int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	
	String print() {
		return super.print() + " " + hireYear;
	}
}//

class PartTime extends Employee2{
	private int workDay;
	
	PartTime(String empno, String name, int pay, int workDay){
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	double getMonthPay() {
		return super.getPay()*workDay;
	}
	
	String print() {
		return super.print() + " " + workDay;
	}
}//

public class Ex06_13_±«¡ÿ {
	public static void main(String[] args) {
		
		PartTime p = new PartTime("p001", "Ω¥∞°", 50000, 20);
		System.out.println(p.print()); //"p001","Ω¥∞°",50000
		System.out.printf("%.2f",p.getMonthPay()); // ±ﬁø©√‚∑¬

		System.out.println("\n");
		
		Contract c = new Contract("c003", "∫ﬂ", 1500000, 3);
		System.out.println(c.print()); 
		System.out.printf("%.2f",c.getMonthPay()); // ±ﬁø©√‚∑¬

		System.out.println("\n");
		
		FullTime f = new FullTime("e007", "¡¶¿Ã»©", 25000000, 700);
		System.out.println(f.print()); 
		System.out.printf("%.2f",f.getMonthPay()); 

		
		System.out.println("\n");
		System.out.println();
		
		Employee2[] arr = { p,c,f };
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].print());
			System.out.printf("%.2f",arr[i].getMonthPay());
			System.out.println("\n");
		}
		
	}
}

