package com.numbertheory;

public class PrimeNumber26 {

	public static void main(String[] args) {

		int ct = 0;
		int n = 0;
		int i = 1;
		int j = 1;
		int sum=0;

		while (n < 30) {
			j = 1;
			ct = 0;
			while (j <= i) {
				if (i % j == 0)
					ct++;
				j++;
			}
			if (ct == 2) {
				
				System.out.println(i);
				sum=sum+i;
				n++;
			}
			i++;
		}
	System.out.println(sum);

	}
}
