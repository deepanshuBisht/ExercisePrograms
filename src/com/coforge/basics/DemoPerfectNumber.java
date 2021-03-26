package com.coforge.basics;

import java.util.Scanner;

public class DemoPerfectNumber {

	public static void main(String[] args) {
		int Num;
		int Sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any Number: ");
		Num = sc.nextInt();
		sc.close();

		for (int i = 1; i < Num; i++) {
			if (Num % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == Num) {
			System.out.format("Perfect Number");
		} else {
			System.out.format("Not a Perfect Number");
		}

	}

}
