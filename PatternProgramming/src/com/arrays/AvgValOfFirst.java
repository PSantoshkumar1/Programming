package com.arrays;

import java.util.Arrays;

public class AvgValOfFirst {

	public static void main(String[] args) {


		int [] ar= {1,2,3,4,5,6,7,8,9,10};
		
		int n=ar.length ;
		float sum=0;
		float count=0;
		
		for(int i=0;i<n;i++)
		{
			if(i<=n/2) 
			{
				sum=sum+i;
				count++;
				 //System.out.println(sum);
			}
}
			 System.out.println(sum/count);

			 }
	}


