package com.cognizant.observerPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminService implements IAdminService {
	List<IAdminObserver> observers;
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminService.class);

	public AdminService() {
		super();
		this.observers = new ArrayList<>();
	}

	public void subScribe(IAdminObserver adminObserver) {
		observers.add(adminObserver);
		for (IAdminObserver iAdminObserver : observers) {
			LOGGER.info(iAdminObserver.toString());
		}
	}

	public void unSubScribe(IAdminObserver adminObserver) {
		observers.remove(adminObserver);
		for (IAdminObserver iAdminObserver : observers) {
			LOGGER.info(iAdminObserver.toString());
		}
	}

	public void notificationToAll() {
		for (IAdminObserver iAdminObserver : observers) {
			if (iAdminObserver.getNoOfTickets() >= 100)
				iAdminObserver.notification();
		}
	}

}
