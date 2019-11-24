package com.starpattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		int n = 7;
		int x = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j >= x && j <= n - x + 1)

					System.out.print(x + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
			x--;
		}

	}
}
