package com.alphabetic;

public class PatternN {
	public static void main(String[] args) {
		
		
		int n=7;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(j==1||j==n||i==j)
			System.out.print("N");
			else
				System.out.print(" ");
			}
			x++;
			System.out.println();
		}
	}

}
