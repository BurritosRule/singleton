package com.github.car;

public class Run {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();

		Car car1 = carFactory.getCar("small");
		car1.size();

		Car car2 = carFactory.getCar("medium");
		car2.size();

		Car car3 = carFactory.getCar("large");
		car3.size();
	}
}