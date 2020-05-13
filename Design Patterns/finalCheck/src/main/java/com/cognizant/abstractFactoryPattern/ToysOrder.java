package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ToysOrder extends Order {
	Channel channel;
	private static final Logger LOGGER = LoggerFactory.getLogger(ToysOrder.class);
	public ToysOrder(Channel channel, ProductType productType) {
		super(productType, channel);
		this.channel=channel;
		processOrder();
	}

	@Override
	void processOrder() {
		LOGGER.info("Toys Order is Placed from " +channel);
	}

}