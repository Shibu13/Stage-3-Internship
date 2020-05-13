package com.cognizant.abstractFactoryPattern;

public class Client {
	public static void main(String[] args) {

	AbstractFactoryDesign factory1=FactoryProducer.getFactory(Channel.ECommerceWebsite);
	factory1.getOrder(ProductType.ElectronicProducts);
	factory1.getOrder(ProductType.Furniture);
	factory1.getOrder(ProductType.Toys);
	
	AbstractFactoryDesign factory2=FactoryProducer.getFactory(Channel.TeleCallerAgentsApplication);
	factory2.getOrder(ProductType.ElectronicProducts);
	factory2.getOrder(ProductType.Furniture);
	factory2.getOrder(ProductType.Toys);
	
	}
}
