package com.starpattern;

public class Pattern15 {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < 2 * i - 1; j++) {
				if (i >= j)
					System.out.print("*");
				else
					System.out.println("");
			}
			System.out.println();
		}
	}

}
