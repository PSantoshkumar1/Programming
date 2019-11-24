package com.arrays;

public class OddIndexedof {

	public static void main(String[] args) {
		
	
		int [] arr= { 3, 6, 12, 1, 5, 8 }; 
		int n=arr.length ;
	for(int i=0;i<n;i++)
	{
		if(i%2!=0)
		System.out.println(arr[i]);
	}
	
}
}
