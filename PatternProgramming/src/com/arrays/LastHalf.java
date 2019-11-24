package com.arrays;

public class LastHalf {
public static void main(String[] args) {
	int [] a= {1,2,3,3,4,5,66,7,86};
	
	for(int i1=0;i1<=a.length/2;i1++)
	{System.out.println(i1);
	}
	for(int i=a.length-1;i>=a.length/2;i--)
	{
	System.out.println(a[i]);
	}
}
}

