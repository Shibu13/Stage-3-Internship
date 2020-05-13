package com.cognizant.abstractFactoryPattern;

public class USACarFactory extends AbstractCarFactory {

	@Override
	public Car getCar(CarType model) {
		if (model.equals(CarType.LUXURY))
			return new LuxuryCar(Location.USA);
		else if (model.equals(CarType.MICRO))
			return new MicroCar(Location.USA);
		else
			return new MiniCar(Location.USA);
	}

}
