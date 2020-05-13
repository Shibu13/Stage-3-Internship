package com.cognizant.observerPattern;

public class Main {
	public static void main(String[] args) {
		IAdminService adminService = new AdminService();
		IAdminObserver admin1 = new AdminObserver(100);
		IAdminObserver admin2 = new AdminObserver(120);
		IAdminObserver admin3 = new AdminObserver(90);

		adminService.subScribe(admin1);
		adminService.subScribe(admin2);
		adminService.subScribe(admin3);

		adminService.notificationToAll();

		adminService.unSubScribe(admin3);

	}
}
