package com.arrays;

public class EvenReverse {

	public static void main(String[] args) {
		
	
		int [] arr= { 3, 6, 12, 1, 5, 8 }; 
		int n=arr.length ;
	for(int i=n-1;i>=0;i--)
	{
		if(i%2==0)
		System.out.println(arr[i]);
	}
	
}

}
