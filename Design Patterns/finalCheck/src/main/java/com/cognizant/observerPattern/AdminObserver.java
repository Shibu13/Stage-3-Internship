package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminObserver implements IAdminObserver {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminObserver.class);
	int noOfTickets;

	public AdminObserver(int noOfTickets) {
		super();
		this.noOfTickets = noOfTickets;
	}

	public void notification() {
		LOGGER.info("Event notification received " + noOfTickets);
	}

	public int getNoOfTickets() {
		// TODO Auto-generated method stub
		return noOfTickets;
	}

	@Override
	public String toString() {
		return "AdminObserver [noOfTickets=" + noOfTickets + "]";
	}

}
