package com.starpattern;

public class Pattern10 {
	
	
	public static void main(String[] args) {
		
		int n = 8;
		int x=n,y=x;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= 2*n; j++) {
				if (j >=x && j<=y)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			x--;
			y++;
			System.out.println();
		}
	}

}
