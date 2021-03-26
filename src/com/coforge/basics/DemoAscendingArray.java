package com.coforge.basics;

import java.util.Scanner;

public class DemoAscendingArray {

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
		int temp;
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arg[i] > arg[j]) {
					temp = arg[i];
					arg[i] = arg[j];
					arg[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order : ");
		for (int i = 0; i < num; i++) {
			System.out.print(arg[i] + " ");
		}

	}

}
