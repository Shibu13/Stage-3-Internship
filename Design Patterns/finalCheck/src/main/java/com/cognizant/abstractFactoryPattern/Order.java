package com.cognizant.abstractFactoryPattern;

public abstract class Order {
	
	ProductType productType=null;
	Channel channel=null;
	public Order(ProductType productType, Channel channel) {
		super();
		this.productType = productType;
		this.channel = channel;
	}
	abstract void processOrder();
	
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "Order [productType=" + productType + ", channel=" + channel + "]";
	}
	
	

}
