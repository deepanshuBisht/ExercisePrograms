package com.coforge.basics;

public class DemoInvertedPyramid {

	public static void main(String[] args) {
		int row = 8;
		for (int i = row; i >= 1; --i) {
			for (int j = 1; j <= row - i; ++j) {
				System.out.print("  ");
			}

			for (int j = i; j <= 2 * i - 1; ++j) {
				System.out.print("* ");
			}

			for (int j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
