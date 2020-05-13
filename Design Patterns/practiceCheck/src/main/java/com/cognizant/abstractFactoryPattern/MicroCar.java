package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car {
	Location location;
	private static final Logger LOGGER = LoggerFactory.getLogger(MicroCar.class);

	MicroCar(Location location) {
		super(CarType.MICRO, location);
		this.location = location;
		constract();
	}

	@Override
	protected void constract() {
		LOGGER.info("Connecting to Micro car. from " + location);

	}

}
