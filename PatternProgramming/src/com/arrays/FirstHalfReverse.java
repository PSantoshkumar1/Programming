package com.arrays;

public class FirstHalfReverse {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=a.length/2;i>=0;i--)
		{
		System.out.println(a[i]);
		}
		for(int i=0;i<=a.length;i++)
		{
			if(i>a.length/2)
				System.out.println(i);
		}
	}

}
