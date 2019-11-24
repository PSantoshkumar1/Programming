package com.arrays;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80,90};
		//int [] ar= new int[8];
		int sum=0;
		for(int i=0;i<9;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(" "+sum);
	}

}
