abstract class Shape{//�߻� Ŭ���� :�߻� �޼��带 �����ִ� �̿ϼ��� Ŭ����
	Shape(){
		System.out.println("Shape ������");
	}
	
	void make() { //����
		System.out.println("���� �׸���");
	}
	
	abstract void draw(); // �̿ϼ� �޼���(�߻�޼���) :�ݵ�� �ϼ��ؾ� �ϴ� �޼��尡 ������ �߻� �޼���,�߻�Ŭ������ ����.
	abstract void delete(); // �̿ϼ� �޼���(�߻�޼���)
}

class Circle extends Shape{
	Circle() {
		System.out.println("Circle ������");
	}
	
	void draw() { // ����
		System.out.println("���� �׸���.");
	}
	
	void delete() {
		System.out.println("���� �����.");
	}
	
}

class Triangle extends Shape{
	Triangle(){
		System.out.println("Triangle ������");
	}
	
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
	
	void delete() {
		System.out.println("�ﰢ���� �����.");
	}
}

public class Ex06_12_�߻� {
	public static void main(String[] args) {
		//make(); //ȣ��
		
		//Shape s = new Shape(); // �߻�Ŭ������ ��ü�� ���� ���� ������
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
		
		//Shape[] arr = {c,t}; //�Ʒ��� �ٸ��� : �����ڸ� ���� ��ü�� ������� �� ���� �Ͽ����Ƿ� �̶� �� �����ڸ� �����Ű�� �ʴ´�.
		Shape[] arr = {new Circle(), new Triangle()};
		for(int i=0; i<arr.length; i++) {
			arr[i].make();
			arr[i].draw();
			arr[i].delete();
			System.out.println();
		}
		
	}
}
