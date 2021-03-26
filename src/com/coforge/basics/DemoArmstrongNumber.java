package com.coforge.basics;

import java.util.Scanner;

public class DemoArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find weather it's armstrong or not...");
		int check = 0;
		int lastDigit;
		int temp;
		int num = sc.nextInt();
		sc.close();
		temp = num;
		while (num > 0) {
			lastDigit = num % 10;
			num = num / 10;
			check = check + (lastDigit * lastDigit * lastDigit);
		}
		if (temp == check)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Amstrong Number");

	}

}
