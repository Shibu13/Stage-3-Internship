package com.cognizant.abstractFactoryPattern;

public class FactoryProducer {

	public static AbstractFactoryDesign getFactory(Channel channel){   
	      if(channel.equals(Channel.ECommerceWebsite)){
	         return new ECommerceFactory();         
	      }else{
	         return new TeleCallerFactory();
	      }
	   }
}
