package com.arrays;

public class MinElement {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
				System.out.println(a[i]);
			else if (a[i]>min)
				System.out.println(min);
		}
		//System.out.println(min);

		
	}
}
