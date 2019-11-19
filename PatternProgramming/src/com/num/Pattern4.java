
package com.num;

public class Pattern4 {
	public static void main(String[] args) {
		
		
		int n = 7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				if(i+j==n/2 && i<n/2||j==n-3||i==n/2)
				{
				System.out.print("4");
				}
			else
			{
			System.out.print(" ");
			}
		}
			System.out.println( );
	}
		
	}

}
