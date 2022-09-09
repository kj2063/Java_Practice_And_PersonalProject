
public class Car {
	private String name;
	private double fuel;

	Car(String name, double fuel){
		this.name = name;
		this.fuel = fuel;
	}
	
	void prnCar() {
		System.out.println("name:" + name);
		System.out.println("fuel:" + fuel);
	}
}
