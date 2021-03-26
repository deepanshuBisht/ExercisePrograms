package com.coforge.intercalcu;

public class CalculatorDemo {

	public static void main(String[] args) {
//		BasicCalculator cal = new BasicCalculator();
//		cal.add(10, 20);
//		cal.diff(20, 10);
//		cal.divide(20, 2);
//		cal.product(20, 20);
//		Scifi sc = (Scifi) cal;
//		sc.cubeArea(20);
//		sc.squareArea(30);
//		
//		System.out.println("**************************************************");
		
		Scifi basic = new Scifi();
		basic.add(12, 30);
		basic.diff(50, 20);
		basic.divide(10, 2);
		basic.product(10, 10);
		basic.cubeArea(30);
		basic.squareArea(20);

	}

}
