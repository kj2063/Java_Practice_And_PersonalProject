class Sports{//부모클래스 (상위클래스,조상클래스,base클래스)
	String name;
	int inwon;
	
}//Sports

class Baseball extends Sports{//자식클래스 (하위클래스,자손클래스,derived클래스)   -상속 :중복되는것을 줄일 수 있다.
//	String name;
//	int inwon;
	double tayul;
	
	Baseball(String name,int inwon, double tayul){
		this.name = name;
		this.inwon = inwon;
		this.tayul = tayul;
	}
	
	void display() {
		System.out.println(name + ", "+ inwon+", "+ tayul);
	}
}//Baseball
	
class Football extends Sports{//자식클래스 (하위클래스)
//	String name;
//	int inwon;
	int goalsu;
	
	Football(String name, int inwon, int goalsu){
		this.name = name;
		this.inwon = inwon;
		this.goalsu = goalsu;
	}
	
	void display() {
		System.out.println(name + ", "+ inwon+", "+ goalsu);
	}
}//Football

public class Ex06_01_상속 {
	public static void main(String[] args) {
		Baseball bb = new Baseball("야구",9,0.235);
		bb.display();
		Football fb = new Football("축구",11,6);
		fb.display();
	}
}
