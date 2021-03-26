package com.coforge.basics;

import java.util.Scanner;

public class DemoReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of elements you want in array......");
		int num = sc.nextInt();
		int arg[] = new int[num];
		System.out.println("Enter all the elements.....");
		for (int i = 0; i < num; i++) {
			arg[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("All Elements are : ");
		for (int j = num - 1; j >= 0; j--) {
			System.out.print(arg[j] + " ");
		}

	}

}
