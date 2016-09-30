package com.liang.spring.beans.factorybean;

public class Car {
	private String name;
	private double price;
	private double wight;
	
	
	
	public Car(String name, double price, double wight) {
		this.name = name;
		this.price = price;
		this.wight = wight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public double getWight() {
		return wight;
	}
	public void setWight(double wight) {
		this.wight = wight;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", wight=" + wight
				+ "]";
	}
	

}
