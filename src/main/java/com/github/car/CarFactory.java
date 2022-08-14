package com.github.car;

public class CarFactory {
	public Car getCar(String carSize) {
		if (carSize == null) {
			return null;
		}
		if (carSize.equalsIgnoreCase("SMALL")) {
			return new Sedan();
		} else if (carSize.equalsIgnoreCase("MEDIUM")) {
			return new Suv();
		} else if (carSize.equalsIgnoreCase("LARGE")) {
			return new Truck();
		}
		return null;
	}

}
