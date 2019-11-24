package com.numbertheory;

import java.util.Scanner;

public class EvenOrOdd07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		
			if(a%2==0)
		System.out.println("Given number is even   " );
			else 
				System.out.println("Given number is odd   ");
}
	}
