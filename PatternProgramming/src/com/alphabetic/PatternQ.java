package com.alphabetic;

public class PatternQ {
public static void main(String[] args) {
	

	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(((i==1 || i==n-n/2 +1) && j <=n-n/2+1) || ((j==1 || j==n-n/2+ 1) && i<= n-n/2 +1))
			
				System.out.print("Q");
			
			else if( j==i && i>=n-n/2 +1) 
				
				System.out.print(" Q");
			else 
				System.out.println(" ");
		}
	
			System.out.println( );
		}

}
}