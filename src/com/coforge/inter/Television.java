package com.coforge.inter;

public class Television extends Gadgets implements Insurance {

	public Television(String brand, double price) {
		super(brand, price);
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Television discount price : " + (price - amount));

	}

	@Override
	public void showAccessories() {
		System.out.println("Remote, Cleaning Kit, TV Stand");

	}

	@Override
	public void getInsurance() {
		System.out.println("Insurance for your Television");
		
	}
	
	

}
