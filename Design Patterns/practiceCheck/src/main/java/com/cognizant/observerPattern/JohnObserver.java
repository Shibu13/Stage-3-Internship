package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.abstractFactoryPattern.CarClient;

public class JohnObserver implements INotificationObserver {
	String name = "John";
	private static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);

	public void onServerDown() {
		LOGGER.info(name + " : Notification has been Recieved");
	}

	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
