package com.coforge.inter;

public abstract class Gadgets implements Accessories {

	String brand;
	double price;

	public Gadgets(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public void getDetails() {
		System.out.println("Name : " + brand + " " + "Price : " + price);
	}

	public abstract void getDiscountedPrice(int amount);

}
