package com.numbertheory;

import java.util.Scanner;

public class SumOfeven {

	public static void main(String[] args) {
		

		
		int num=40;
		int sum=0;
	
		for(int i=0;i<=num;i++) {
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println(sum);
		
		}
		
}
