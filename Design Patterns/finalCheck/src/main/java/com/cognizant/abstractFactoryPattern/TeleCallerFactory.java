package com.cognizant.abstractFactoryPattern;

public class TeleCallerFactory extends AbstractFactoryDesign {

	@Override
	public Order getOrder(ProductType productType) {
		if(productType.equals(ProductType.ElectronicProducts))
			return new ElectronicOrder(Channel.TeleCallerAgentsApplication, productType);
		else if (productType.equals(ProductType.Furniture))
		   return new FurnitureOrder(Channel.TeleCallerAgentsApplication, productType);
		else
			return new ToysOrder(Channel.TeleCallerAgentsApplication, productType);
		
			
	}

}
