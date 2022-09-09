class Student2{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Student2(){
		this.name = "����";
		this.kor = 	30;	
		this.eng = 40;
		this.math = 50;
	}
	
	Student2(String name){
		this.name = name;
		this.kor = 	11;
		this.eng = 22;
		this.math = 33;
	}
	
	Student2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void display() {
		System.out.printf("%s,%d,%d,%d\n",name,kor,eng,math);
	}
	
	String getName() {
		return name;
	}
}


public class Ex05_19_��ü�迭 {
	public static void main(String[] args) {
		
		Student2 st1 = new Student2(); //����,30,40,50 // ������ = �ּ� , ��������: �������� ��� ����
		Student2 st2 = new Student2("�¿�"); //�¿�,11,22,33
		Student2 st3 = new Student2("����",70,80,90); 
		
		st1.display();
		System.out.println(st1.getName());
		st2.display();
		st3.display();
		System.out.println();
		
		Student2[] st_arr = new Student2[3]; //�� 3���� ����
		st_arr[0] = new Student2();// 0���濡 ���� ��ü�� �ּ� ����
		st_arr[1] = new Student2("�¿�");
		st_arr[2] = new Student2("����",70,80,90);
		
		int i;
		for(i=0;i<st_arr.length;i++) {
			st_arr[i].display();
			System.out.println(st_arr[i].getName());
		}
		System.out.println();
		
		//�̷��Ե� �ǳ�.
		Student2[] st_arr1 = {new Student2(), new Student2("�¿�"), new Student2("����",70,80,90)};
		for(i=0;i<st_arr1.length;i++) {
			st_arr1[i].display();
		}
		
		
		
	}
}
