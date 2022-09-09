class Car{
	private String name;
	private int year;
	private String color;
	
	Car(){}
	
	Car(String name, int year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setYear(int year){
		this.year = year;
	}
	void setColor(String color){
		this.color = color;
	}
	String getName() {
		return name;
	}
	int getYear() {
		return year;
	}
	String getColor() {
		return color;
	}
	
}

public class Ex05_16_setter_getter {
	public static void main(String[] args) {
		
		Car car = new Car();
		//car.name = "¸ð´×";
		
		//System.out.println(car.name);
		car.setName("¸ð´×");
		car.setYear(2020);
		car.setColor("yellow");
		System.out.println(car.getName());
		System.out.println(car.getYear());
		System.out.println(car.getColor());
		
		System.out.println();
		
		Car car2 = new Car("Åõ½Ñ",2017,"white");
		System.out.println(car2.getName());
		System.out.println(car2.getYear());
		System.out.println(car2.getColor());
		
	}
}
