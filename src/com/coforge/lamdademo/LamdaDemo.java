package com.coforge.lamdademo;

public class LamdaDemo {
	
	public static void main(String[] args) {
		
		Calculator cal = (num1, num2)-> System.out.println("Sum : "+(num1+num2));
		cal.calculator(10, 20);
		cal = (num1,num2)->{
			System.out.println("Product");
			System.out.println(num1*num2);
		};
		cal.calculator(20, 2);
	}

}
