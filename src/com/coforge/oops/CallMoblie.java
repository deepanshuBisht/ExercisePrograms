package com.coforge.oops;

public class CallMoblie {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Samsung", 101, 23000.50);
		mobile.getDetails();
		System.out.println("Discount on your moblie : " + mobile.discount(10));

		System.out.println("********************************************");

		Mobile mobile1 = new Mobile("Apple", 12, 60500.20);
		mobile1.getDetails();
		System.out.println("Discount on your moblie : " + mobile.discount(0.5));

	}
}
