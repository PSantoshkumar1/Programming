package com.arrays;

public class SecondMaximum {
	public static void main(String[] args) {
		
		int [] a = {15,22,49,60,50,};
		
		
		int max= a[0];
		int smax=a[0];
		
		System.out.println("given array is ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax){
				smax=a[i];
			
			}
		}
		System.out.println("Second maximum number is " +   smax);
				
	}

}
