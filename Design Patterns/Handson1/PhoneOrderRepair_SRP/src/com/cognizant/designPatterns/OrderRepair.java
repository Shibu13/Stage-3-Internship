package com.cognizant.designPatterns;

import java.util.Scanner;

public class OrderRepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our site. Would you like to order or repair?");
		Scanner sc = new Scanner(System.in);
		String processOption = sc.nextLine().toLowerCase().trim();
		String productDetail = null;

		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail = sc.nextLine().trim();
			PhoneOrder phoneOrder = new PhoneOrder();
			phoneOrder.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine().toLowerCase().trim();
			
			if(productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				PhoneRepair phoneRepair = new PhoneRepair();
				productDetail = sc.nextLine().trim();
				phoneRepair.ProcessPhoneRepair(productDetail);
			}
			else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				AccessoryRepair accessoryRepair = new AccessoryRepair();
				productDetail = sc.nextLine().trim();
				accessoryRepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
		
		sc.close();
	}

}
