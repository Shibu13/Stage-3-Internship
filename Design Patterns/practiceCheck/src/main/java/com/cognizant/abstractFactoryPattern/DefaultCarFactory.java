package com.cognizant.abstractFactoryPattern;

public class DefaultCarFactory extends AbstractCarFactory {

	@Override
	public Car getCar(CarType model) {
		if (model.equals(CarType.LUXURY))
			return new LuxuryCar(Location.DEFAULT);
		else if (model.equals(CarType.MICRO))
			return new MicroCar(Location.DEFAULT);
		else
			return new MiniCar(Location.DEFAULT);
	}

}
