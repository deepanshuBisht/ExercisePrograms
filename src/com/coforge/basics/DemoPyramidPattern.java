package com.coforge.basics;

import java.util.Scanner;

public class DemoPyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of pyramid..");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {

			for (int j = num - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
