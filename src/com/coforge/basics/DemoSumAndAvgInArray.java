package com.coforge.basics;

import java.util.Scanner;

public class DemoSumAndAvgInArray {

	public static void main(String[] args) {
		int sum = 0, avg;
		System.out.println("Enter numbers of enteries you want to enter");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] marks = new int[count];
		for (int i = 0; i < count; i++) {
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}
		avg = sum / count;
		System.out.println("Sum of the inputs numbers : " + sum);
		System.out.println("Avg of the inputs numbers : " + avg);
		sc.close();

	}

}
