package com.javastudy;

public class Car {
	private String name;
	private double fuel;

	public Car(String name, double fuel){ //패키지가 다른곳에서는 public 을 쓰지 않으면 not visible 오류가 뜬다.
		this.name = name;
		this.fuel = fuel;
	}
	
	public void prnCar() {
		System.out.println("c.j.name:" + name);
		System.out.println("c.j.fuel:" + fuel);
	}
}
