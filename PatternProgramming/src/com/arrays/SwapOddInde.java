package com.arrays;

public class SwapOddInde {
	public static void main(String[] args) {
		int arr[]= {5,2,3,4,1};
		int temp;
		System.out.println("before swapping:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==0)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;	
			}
		}
		System.out.println("after swapping:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	}


