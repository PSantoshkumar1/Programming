package com.numbertheory;

public class Fibonassi34 {
public static void main(String[] args) {
	
	int first=0;
	int second=1;
	
	int sum=first+second;
	
	while(sum<=100)
	{
		System.out.println( sum);
		first=second;
		second=sum;
		sum=first+second;
	}
}
}
