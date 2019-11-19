package com.alphabetic;

public class PatternR {
	public static void main(String[] args) {
		
		int n=7;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n/2+1;j++)
			{
				if (j==1 || i==1  || i==n/2 +1  ||(i <=n/2 &&j==n/2 +1  || j==x))
				
					System.out.print(" R ");
					else
						System.out.print(" ");
			}
	if(i >n/2)
			x++;
		System.out.println();

	}
		
	}
	
}

