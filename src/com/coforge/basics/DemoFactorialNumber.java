package com.coforge.basics;

import java.util.Scanner;

public class DemoFactorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number for it's Factorial..");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorail Number for " + num + " is : " + fact);
		sc.close();
	}

}
