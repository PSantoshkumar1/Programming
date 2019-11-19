package com.alphabetic;

public class PatternV {
	public static void main(String[] args) {
		
		int n=8;
		int x=1;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<2*n;j++)
			{
			if(j==x||j==2*n-x)
			{
			System.out.print("V");
			}
			else
				System.out.print(" ");
		}
			System.out.println();
			x++;

}
	}
}
