package com.numbertheory;

import java.util.Scanner;

public class SumOfTwoNumber05 {
	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any 3 number's");

				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				
				
		
		if(a+b==c ||b+c==a || c+a==b)
			
			System.out.println("true");
		else
			System.out.println("false");
		
		
	}

}
