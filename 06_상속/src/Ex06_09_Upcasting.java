class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("�۸�");
	}
}

public class Ex06_09_Upcasting {// ������: �������� ���¸� ���� �� �ִ� �ɷ�, �ϳ��� ���������� ���� Ÿ���� ��ü�� ���� �� �� �ִ� ��
	public static void main(String[] args) {
		
		double d = 1;// 4byte -> 8byte �� �ڵ� �����Ѵ�. //��ĳ������ �ڵ�!,���� �������ε� �ȴ�.
		System.out.println(d);
		
		int k = (int)3.7; // 8byte -> 4byte �� ���� �����Ѵ�. //�ٿ�ĳ������ ����!
		System.out.println(k);
		
		System.out.println();
		
		Animal a = new Dog();//(Animal) new Dog(); //������ ������ ������, �ڽ�Ŭ�������� �θ�Ŭ������ ��ĳ���� �ɶ� ��ȣ ��(Animal)�� ���� �ʾƵ� �ڵ� �����ȴ�. 
		a.bark();								   //��ĳ������ �ڵ�����!
		
		
	}
}
