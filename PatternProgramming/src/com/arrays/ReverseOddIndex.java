package com.arrays;

public class ReverseOddIndex {
	public static void main(String[] args) {
		
		
		int [] arr= { 3, 6, 12, 1, 5, 8 }; 
		int n=arr.length ;
	for(int i=arr.length-1;i>=0;i--)
	{
		if(i%2!=0)
		System.out.println(arr[i]);
	}
	
}

}
