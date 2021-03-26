package com.coforge.inter;

public class Laptop extends Gadgets {
	
	public Laptop(String brand, Double price) {
		super(brand,price);
	}

	@Override
	public void showAccessories() {
		System.out.println("USB Mouse, Cleaning Kit, Bag");
		
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Price After Discount : "+(price-amount));
		
	}
	
	

}
