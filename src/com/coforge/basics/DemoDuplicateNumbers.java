package com.coforge.basics;

import java.util.Scanner;

public class DemoDuplicateNumbers {

	public static void main(String[] args) {
		System.out.println("Enter, how many elements you want in array.. ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int[] num = new int[count];
		for (int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Duplicate elements in given array : ");

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (num[i] == num[j])
					System.out.println(num[j]);
			}
		}
	}

}
