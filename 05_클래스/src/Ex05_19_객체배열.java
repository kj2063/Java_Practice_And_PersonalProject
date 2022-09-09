class Student2{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Student2(){
		this.name = "서현";
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


public class Ex05_19_객체배열 {
	public static void main(String[] args) {
		
		Student2 st1 = new Student2(); //서현,30,40,50 // 참조값 = 주소 , 참조변수: 참조값을 담는 변수
		Student2 st2 = new Student2("태연"); //태연,11,22,33
		Student2 st3 = new Student2("윤아",70,80,90); 
		
		st1.display();
		System.out.println(st1.getName());
		st2.display();
		st3.display();
		System.out.println();
		
		Student2[] st_arr = new Student2[3]; //방 3개를 생성
		st_arr[0] = new Student2();// 0번방에 생성 객체의 주소 넣음
		st_arr[1] = new Student2("태연");
		st_arr[2] = new Student2("윤아",70,80,90);
		
		int i;
		for(i=0;i<st_arr.length;i++) {
			st_arr[i].display();
			System.out.println(st_arr[i].getName());
		}
		System.out.println();
		
		//이렇게도 되네.
		Student2[] st_arr1 = {new Student2(), new Student2("태연"), new Student2("윤아",70,80,90)};
		for(i=0;i<st_arr1.length;i++) {
			st_arr1[i].display();
		}
		
		
		
	}
}
