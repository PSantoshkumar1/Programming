package com.numbertheory;

public class Palindrome17 {
	public static void main(String[] args) {

		int n=888;
		int rev=0;
		int temp=n;
		int p=0;
		while(n>0) {
			p=n%10;
		rev=rev*10+p;
		
		n=n/10;
		
	}
		if(temp==rev)
		{
			System.out.println("Palindrome number");
		}
		else
			System.out.println("Not a palindrome number ");
	}

}
