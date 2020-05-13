package com.cognizant.designPatterns;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " order accepted!");
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println(accessoryType + " repair accepted!");
	}

}
