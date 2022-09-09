abstract class Shape{//추상 클래스 :추상 메서드를 갖고있는 미완성된 클래스
	Shape(){
		System.out.println("Shape 생성자");
	}
	
	void make() { //정의
		System.out.println("도형 그리기");
	}
	
	abstract void draw(); // 미완성 메서드(추상메서드) :반드시 완성해야 하는 메서드가 있을때 추상 메서드,추상클래스를 쓴다.
	abstract void delete(); // 미완성 메서드(추상메서드)
}

class Circle extends Shape{
	Circle() {
		System.out.println("Circle 생성자");
	}
	
	void draw() { // 구현
		System.out.println("원을 그린다.");
	}
	
	void delete() {
		System.out.println("원을 지운다.");
	}
	
}

class Triangle extends Shape{
	Triangle(){
		System.out.println("Triangle 생성자");
	}
	
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
	
	void delete() {
		System.out.println("삼각형을 지운다.");
	}
}

public class Ex06_12_추상 {
	public static void main(String[] args) {
		//make(); //호출
		
		//Shape s = new Shape(); // 추상클래스로 객체를 만들 수는 없지만
		//Circle c = new Circle();
		Shape c = new Circle();
		c.make();
		c.draw();
		c.delete();
		
		System.out.println();
		
		//Triangle t = new Triangle();
		Shape t = new Triangle();
		t.make();
		t.draw();
		t.delete();
		
		System.out.println("\n");
		
		//Shape[] arr = {c,t}; //아래와 다른점 : 생성자를 먼저 객체가 만들어질 때 생성 하였으므로 이때 또 생성자를 실행시키지 않는다.
		Shape[] arr = {new Circle(), new Triangle()};
		for(int i=0; i<arr.length; i++) {
			arr[i].make();
			arr[i].draw();
			arr[i].delete();
			System.out.println();
		}
		
	}
}
