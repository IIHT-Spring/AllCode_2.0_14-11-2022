package com.core.SpringCoreDemo.lifecycle;

public class Motorbike {
	
	private String name;
	private double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}
	public Motorbike() {
		super();
	}
	
	@Override
	public String toString() {
		return "Motorbike [name=" + name + ", price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("this bean has been initialized ");
	}
	
	
	public void destroy() {
		System.out.println("inside the destroy method");
	}
	
	
	

}
