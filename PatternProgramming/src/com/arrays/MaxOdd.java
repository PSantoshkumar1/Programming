package com.arrays;

public class MaxOdd {
public static void main(String[] args) {
	
		
		int [] a= {1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		int max=0;
		 for(int i=1;i<a.length;i++)
		 {
			 
			 if(i%2!=0)
				 if(a[i]>max) {
					 max=a[i];
				}
			 }
		
			 System.out.println(" " + max);
}
}
