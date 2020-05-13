package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FurnitureOrder extends Order {
	Channel channel;
	private static final Logger LOGGER = LoggerFactory.getLogger(FurnitureOrder.class);
	public FurnitureOrder(Channel channel, ProductType productType) {
		super(productType, channel);
		this.channel=channel;
		processOrder();
	}

	@Override
	void processOrder() {
		LOGGER.info("Furniture Order is Placed from " + channel);
	}

}