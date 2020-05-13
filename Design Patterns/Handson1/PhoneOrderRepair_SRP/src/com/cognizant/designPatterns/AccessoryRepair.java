package com.cognizant.designPatterns;

public class AccessoryRepair implements IAccessoryRepair{

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println(accessoryType + " repair accepted!");
	}

}
