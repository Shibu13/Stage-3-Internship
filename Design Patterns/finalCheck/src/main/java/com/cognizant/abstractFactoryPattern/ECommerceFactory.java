package com.cognizant.abstractFactoryPattern;

public class ECommerceFactory extends AbstractFactoryDesign {

	@Override
	public Order getOrder(ProductType productType) {
		if(productType.equals(ProductType.ElectronicProducts))
			return new ElectronicOrder(Channel.ECommerceWebsite, productType);
		else if (productType.equals(ProductType.Furniture))
		   return new FurnitureOrder(Channel.ECommerceWebsite, productType);
		else
			return new ToysOrder(Channel.ECommerceWebsite, productType);
		
			
	}

}
