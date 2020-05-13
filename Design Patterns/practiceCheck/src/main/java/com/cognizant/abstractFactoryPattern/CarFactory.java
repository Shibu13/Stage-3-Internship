package com.cognizant.abstractFactoryPattern;

public class CarFactory {

	public static Car buildCar(CarType model,Location location) {
		if(location.equals(Location.INDIA))
			return new IndianCarFactory().getCar(model);
		else if(location.equals(Location.USA))
			return new USACarFactory().getCar(model);
		else
			return new DefaultCarFactory().getCar(model);
		
	}
}
