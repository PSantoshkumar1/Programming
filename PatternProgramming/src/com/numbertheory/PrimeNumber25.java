package com.numbertheory;

public class PrimeNumber25 {
	public static void main(String[] args) {

		int ct = 0;
		int n = 50;
		int i = 70;
		int j = 1;

		while (n < 70) 
		{
			j = 50;
			ct = 0;
			while (j <= i) {
				if (i % j == 0)
					ct++;
				j++;
			}
			if (ct == 2) {
				System.out.println(i);
				n++;
			}
			i++;
		}
	}

}
