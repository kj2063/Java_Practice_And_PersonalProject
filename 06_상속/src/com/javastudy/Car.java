package com.javastudy;

public class Car {
	private String name;
	private double fuel;

	public Car(String name, double fuel){ //��Ű���� �ٸ��������� public �� ���� ������ not visible ������ ���.
		this.name = name;
		this.fuel = fuel;
	}
	
	public void prnCar() {
		System.out.println("c.j.name:" + name);
		System.out.println("c.j.fuel:" + fuel);
	}
}
