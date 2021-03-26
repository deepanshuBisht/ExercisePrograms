package com.coforge.inter;

public class ShopDemo {

	public static void main(String[] args) {
		
		Gadgets gadgets = new Television("Samsung", 23000.50);
		gadgets.getDetails();
		gadgets.getDiscountedPrice(3000);
		gadgets.showAccessories();
		Insurance ins = (Insurance) gadgets;
		ins.getInsurance();

		System.out.println("***************************************************");

		Gadgets gadgets1 = new Laptop("Dell", 55000.50);
		gadgets1.getDetails();
		gadgets1.getDiscountedPrice(5000);
		gadgets1.showAccessories();

	}

}
