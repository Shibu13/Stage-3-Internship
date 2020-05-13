package com.cognizant.designPatterns;

public class AccessoryRepair implements IAccessoryRepair{

	@Override
	public void ProcessAccessoryRepair(String accessoryName) {
		// TODO Auto-generated method stub
		System.out.println(accessoryName + " repair accepted!");
	}

}
