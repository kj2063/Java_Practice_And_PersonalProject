package ����;

class cars{ //�������� �Ű������� �������� ������� �� �� ������, �ߺ��Ǵ� �����ڴ� this()���� ����Ͽ� �ּ�ȭ �� �� �ִ�.
	String company = "�����ڵ���";
	String name;
	String color;
	String size;

	cars(){}
	
	cars(String name){
		this(name,"����","����");//this()�� ����ϸ� �ٸ� �����ڸ� ȣ���Ѵ�. 3���� ���ڸ� ������ �ڿ������� ������3���� �����ڸ� ȣ��. 
	}
	
	cars(String name, String color){
		this(name,color,"����");
	}
	
	cars(String name, String color, String size){
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
}


public class p212_�ٸ�������ȣ�� {
	public static void main(String[] args) {
	
		System.out.println(new cars("�ҳ�Ÿ").color);
		
	}
}
