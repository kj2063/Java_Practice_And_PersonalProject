package 연습;

class cars{ //생성자의 매개변수를 여러가지 방법으로 쓸 수 있을때, 중복되는 생성자는 this()문을 사용하여 최소화 할 수 있다.
	String company = "현대자동차";
	String name;
	String color;
	String size;

	cars(){}
	
	cars(String name){
		this(name,"빨강","소형");//this()를 사용하면 다른 생성자를 호출한다. 3개의 인자를 넣으니 자연스럽게 변수가3개인 생성자를 호출. 
	}
	
	cars(String name, String color){
		this(name,color,"중형");
	}
	
	cars(String name, String color, String size){
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
}


public class p212_다른생성자호출 {
	public static void main(String[] args) {
	
		System.out.println(new cars("소나타").color);
		
	}
}
