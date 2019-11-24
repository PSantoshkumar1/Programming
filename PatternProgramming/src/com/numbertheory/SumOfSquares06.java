package com.numbertheory;

import java.util.Scanner;

public class SumOfSquares06 {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any 3 number's");

				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				
				
		
		if(a*a==b ||b*b==a || c*c==b)
			
			System.out.println("true");
		else
			System.out.println("false");
	}

}
