package com.starpattern;

public class Pattern23 {
public static void main(String[] args) {
	int n =7;
	int x = n / 2 + 1;
	for (int i = 1 ; i <= n ; i++) {
		for (int j = 1; j <= n; j++) {
			if (j >= x && j <= n - x + 1) 
				System.out.print(" 1 ");
			 else 
				System.out.print("   ");
			}
			if (i <= n / 2 )
				x--;
			else
				x++;
			System.out.println();
		}
}
}
