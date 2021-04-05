package com.coforge.lamdemos;

public class CalculatorRun {

	public static void main(String[] args) {
		
		BonusCalculator magBonusCal = (amount) ->{
			System.out.println("Manager Bonus Amount");
			return (amount*5);
		};
		
		BonusCalculator devBonusCal = (amount) ->{
			System.out.println("Developer Bonus Amount");
			return (amount*3);
		};
		
		BonusCalculator admBonusCal = (amount) ->{
			System.out.println("Admin Bonus Amount");
			return (amount*2);
		};
		
		System.out.println(magBonusCal.calculateBonus(5000.5));
		System.out.println(devBonusCal.calculateBonus(3000.5));
		System.out.println(admBonusCal.calculateBonus(10000.5));
		
	}

}
