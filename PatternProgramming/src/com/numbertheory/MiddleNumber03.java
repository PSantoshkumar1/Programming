package com.numbertheory;

public class MiddleNumber03 {
	public static void main(String[] args) {
		
		int a=50;
		int b=0;
		int c=70;
		
		if((a<b && b<c) || (c<b && b<a ))
			System.out.println(b);
		else if((b<a && a<c) ||(c<a && a<b))
			System.out.println(a);
		else
			System.out.println(c);
	}

}
