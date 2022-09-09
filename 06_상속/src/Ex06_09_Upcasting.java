class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("멍멍");
	}
}

public class Ex06_09_Upcasting {// 다형성: 여러가지 형태를 가질 수 있는 능력, 하나의 참조변수로 여러 타입의 객체를 참조 할 수 있는 것
	public static void main(String[] args) {
		
		double d = 1;// 4byte -> 8byte 로 자동 변경한다. //업캐스팅은 자동!,물론 수동으로도 된다.
		System.out.println(d);
		
		int k = (int)3.7; // 8byte -> 4byte 로 수동 변경한다. //다운캐스팅은 수동!
		System.out.println(k);
		
		System.out.println();
		
		Animal a = new Dog();//(Animal) new Dog(); //원래는 다음과 같은데, 자식클래스에서 부모클래스로 업캐스팅 될때 괄호 안(Animal)을 쓰지 않아도 자동 변형된다. 
		a.bark();								   //업캐스팅은 자동으로!
		
		
	}
}
