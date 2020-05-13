package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car {

	Location location;

	private static final Logger LOGGER = LoggerFactory.getLogger(LuxuryCar.class);

	LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		this.location = location;
		constract();
	}

	@Override
	protected void constract() {
		LOGGER.info("Connecting to luxury car. from " + location);
	}

}
