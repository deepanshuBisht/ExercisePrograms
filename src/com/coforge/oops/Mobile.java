package com.coforge.oops;

public class Mobile {
	String brandName;
	int modelNumber;
	double price;

	public Mobile(String brandName, int modelNumber, double price) {
		this.brandName = brandName;
		this.modelNumber = modelNumber;
		this.price = price;
	}

	public void getDetails() {
		System.out.println("Name : " + brandName);
		System.out.println("Name : " + modelNumber);
		System.out.println("Name : " + price);
	}

	public double discount(double dis) {
		return price / dis;
	}

}
