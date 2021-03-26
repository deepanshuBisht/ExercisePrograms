package com.coforge.intercalcu;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int num1, int num2) {
		System.out.println("Sum : " + (num1 + num2));

	}

	@Override
	public void product(int num1, int num2) {
		System.out.println("Product : " + (num1 * num2));

	}

	@Override
	public void diff(int num1, int num2) {
		System.out.println("Difference : " + (num1 - num2));

	}

	@Override
	public void divide(int num1, int num2) {
		System.out.println("Divide : " + (num1 / num2));

	}

}
