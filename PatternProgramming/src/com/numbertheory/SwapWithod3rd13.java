package com.numbertheory;

import java.util.Scanner;

public class SwapWithod3rd13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ "   "+b);
        
	}

}
