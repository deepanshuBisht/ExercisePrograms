package com.coforge.intercalcu;

public class Scifi extends BasicCalculator implements Scientific{

	@Override
	public void squareArea(int side) {
		System.out.println("Area of Square : "+(side*side));
		
	}

	@Override
	public void cubeArea(int side) {
		System.out.println("Area of Cude : "+(side*side*side));
		
	}
	
	

}
