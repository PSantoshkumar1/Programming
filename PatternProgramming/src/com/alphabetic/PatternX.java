package com.alphabetic;

public class PatternX {	
	
	public static void main(String[] args) {

				int n = 7;
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++){
						if(j==n/2 && i>n/2||i==j && j<n/2+1||i+j==n-1 && i<n/2)
						{
						System.out.print("X");
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