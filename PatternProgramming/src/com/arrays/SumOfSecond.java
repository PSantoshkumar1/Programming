package com.arrays;

public class SumOfSecond {
	public static void main(String[] args) {
		
		
		int [] ar= {10,20,30,40,50,60};
		
		int n=ar.length ;
		int sumS=0;
		
		for(int i=0;i<n;i++)
		{
			if(i>=n/2)
			{
				 sumS = sumS+ar[i];
			}
		}
			 System.out.println(sumS);

			
		}
	}
	


