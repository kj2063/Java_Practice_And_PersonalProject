class Sports{//�θ�Ŭ���� (����Ŭ����,����Ŭ����,baseŬ����)
	String name;
	int inwon;
	
}//Sports

class Baseball extends Sports{//�ڽ�Ŭ���� (����Ŭ����,�ڼ�Ŭ����,derivedŬ����)   -��� :�ߺ��Ǵ°��� ���� �� �ִ�.
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
	
class Football extends Sports{//�ڽ�Ŭ���� (����Ŭ����)
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

public class Ex06_01_��� {
	public static void main(String[] args) {
		Baseball bb = new Baseball("�߱�",9,0.235);
		bb.display();
		Football fb = new Football("�౸",11,6);
		fb.display();
	}
}
