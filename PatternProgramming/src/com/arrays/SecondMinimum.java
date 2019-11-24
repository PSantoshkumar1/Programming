package com.arrays;

public class SecondMinimum {
public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		
		int min= a[0];
		int smin=a[0];
		
		System.out.println("given array is ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) {
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin){
				smin=min;
				min=a[i];
			
			}
		}
		System.out.println("Second manimum number is " +   smin);
				
	}

}
