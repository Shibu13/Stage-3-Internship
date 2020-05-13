package com.cognizant.observerPattern;

public class Main {
	public static void main(String[] args) {
		INotificationObserver ob1 = new SteveObserver();
		INotificationObserver ob2 = new JohnObserver();
		INotificationService service = new NotificationService();
		service.addSubscriber(ob1);
		service.addSubscriber(ob2);
		service.notifySubscriber();
		service.removeSubscriber(ob2);
	}

}
