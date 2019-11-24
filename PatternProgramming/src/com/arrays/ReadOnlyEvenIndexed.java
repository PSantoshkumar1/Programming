package com.arrays;

public class ReadOnlyEvenIndexed {
	
public static void Evenoddproduct(int arr[],int n)
{
	int even=1;
	int odd=1;
	
	for(int i=0;i<n;i++) {
		if(i%2==0)
			even=even*arr[i];
		else
			odd=odd*arr[i];
	}
	
	System.out.println("Even Index product : " + even);
	System.out.println("Odd index product  :  " +odd);
	}
public static void main(String[] args) {
	
	int [] arr= {1,2,3,4,5,6,7,8,9};
	int n=arr.length;
	Evenoddproduct(arr , n);
}

}
