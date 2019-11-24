package com.starpattern;

public class Pattern16 {
	public static void main(String[] args) {

		int n = 8;
         int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 2 * i - 1; j++) {
				
				if (i>= j)
				{
					if(j%2==0)
					
					System.out.print(k++);
				else
					System.out.print("*");
			}
		}
			System.out.println();

	}

	}
}
