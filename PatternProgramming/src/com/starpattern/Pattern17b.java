package com.starpattern;

public class Pattern17b {
	public static void main(String[] args) {

		int n = 5;
		int k = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {

				if (j != 0) {
					System.out.print("*");
				}
				
				System.out.print(k % 2);

				k++;
			}

			System.out.println();
		}
	}

}