package com.alphabetic;

public class PatternJ {
	public static void main(String[] args) {
		
		
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i==0||j==n/2||i==n-1 && j<n/2)
			{
			System.out.print("J");
			}
			else
				System.out.print(" ");
		}
			System.out.println();
		}

}
}
