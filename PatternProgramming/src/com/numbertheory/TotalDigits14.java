package com.numbertheory;

import java.util.Scanner;

public class TotalDigits14 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;

		while (n > 0) {
			int last = n % 10;
			sum = sum + last;
			n = n / 10;
			count++;
		}
		System.out.println(sum);

		System.out.println(count);

	}

}
