package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car {
	private static final Logger LOGGER = LoggerFactory.getLogger(MiniCar.class);
	Location location;

	MiniCar(Location location) {
		super(CarType.MINI, location);
		this.location = location;
		constract();
	}

	@Override
	protected void constract() {
		LOGGER.info("Connecting to Mini car. from " + location);

	}

}
