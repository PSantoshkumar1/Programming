package com.starpattern;

public class Pattern22 {
	public static void main(String[] args) {
		
		int n=7;
		int k=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==k || j==n-k +1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			if(i<=n/2)
				k--;
			else
				k++;
			System.out.println();
		}
	}

}
