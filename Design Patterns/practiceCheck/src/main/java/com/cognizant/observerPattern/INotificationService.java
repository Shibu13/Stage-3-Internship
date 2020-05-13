package com.cognizant.observerPattern;

public interface INotificationService {
	void addSubscriber(INotificationObserver observer);

	void removeSubscriber(INotificationObserver observer);

	void notifySubscriber();
}
