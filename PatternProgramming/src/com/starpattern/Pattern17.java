package com.starpattern;

public class Pattern17 {
	public static void main(String[] args) {
		
		int n=5;
		int k=1;
		for(int i=1;i<n;i++)
		{
			for (int j = 0; j < (2 * i)- 1; j++) {
			{
				if(i>=j)
				{
						System.out.print(k%2);
				}
						
				else if(j%2!=0)
				{
					System.out.print("*");
				}
					
				}
			k++;
				
			}
			System.out.println();
	}
	}

}