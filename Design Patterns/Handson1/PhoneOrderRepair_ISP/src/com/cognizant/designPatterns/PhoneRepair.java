package com.cognizant.designPatterns;

public class PhoneRepair implements IPhoneRepair{

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " repair accepted!");
	}

}
