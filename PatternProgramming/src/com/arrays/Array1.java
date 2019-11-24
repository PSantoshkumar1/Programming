package com.arrays;

public class Array1 {
	public static void main(String[] args) {
		
	  int [] a=new int [10];
	  for(int i=0,j=50;i<a.length;i++)
	  {
		  if(j%8==0) {
			 System.out.println(a[i]); //a[i]=j;
		  i++;
	  }
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

}
}
