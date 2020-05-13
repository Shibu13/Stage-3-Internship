package com.cognizant.observerPattern;

public interface IAdminService {
	void subScribe(IAdminObserver adminObserver);

	void unSubScribe(IAdminObserver adminObserver);

	void notificationToAll();
}
