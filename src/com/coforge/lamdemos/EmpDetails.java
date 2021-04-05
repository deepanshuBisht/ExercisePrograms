package com.coforge.lamdemos;

public class EmpDetails {
	
	void showBonus(String name, String desg, Double amount, BonusCalculator c) {
		System.out.println("Welcome "+ name);
		System.out.println("Your Desg : "+desg);
		System.out.println("Bonus for you is "+ c.calculateBonus(amount));
	}
	
	
}
