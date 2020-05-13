package com.cognizant.abstractFactoryPattern;

public class IndianCarFactory extends AbstractCarFactory {

	@Override
	public Car getCar(CarType model) {
		if (model.equals(CarType.LUXURY))
			return new LuxuryCar(Location.INDIA);
		else if (model.equals(CarType.MICRO))
			return new MicroCar(Location.INDIA);
		else
			return new MiniCar(Location.INDIA);
	}

}
