import java.util.Scanner;

class Person3{
	private String name;
	private int age;
	
	Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() { //�ϳ��� return �� String Ÿ���� ������ int�� �־ String �̴�. 
		return name + "," + age;
	}

}


public class Ex05_21_��ü�迭 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Person3 p1,p2,p3;
		
		Person3[] p = new Person3[3];
		
		int i;
		for(i=0;i<p.length;i++) {
			System.out.printf("\"%d\"��° �� \"�̸�\" : ",i);
			String name = sc.next();
			System.out.printf("\"%d\"��° �� \"����\" : ",i);
			int age = sc.nextInt();
			p[i] = new Person3(name, age);
			
		}
		/*
		for(i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
		}
		*/
		for(i=0;i<p.length;i++) {
			System.out.println(p[i]); //.toString() �̶�� �޼���� Ư���� �޼���� p[i].toString()�̶�� ���� �ʾƵ� �޼��尡 �����ȴ�.
		} 
		
	}
}
