package com.numbertheory;

public class ReverseNumber16 {

	public static void main(String[] args) {

		int n=123112233;
		int rev=0;
		int p=0;
		while(n>0) {
			p=n%10;
		rev=rev*10+p;
		
		n=n/10;
		
	}
		System.out.println(rev);
		
		
	}
}
