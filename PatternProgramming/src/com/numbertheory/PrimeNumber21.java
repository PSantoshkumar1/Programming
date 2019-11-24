package com.numbertheory;

public class PrimeNumber21 {
	public static void main(String[] args) {
		
		int num=13;
		boolean isPrime=true;
		int i=2;
		
		while(i<num-1)
		{
			if(num%2==0)
				isPrime=false;
			break;
		}
		i++;
		
	if(isPrime==false)
		System.out.println("Given Number is Not a prime Number");
		else
			System.out.println("Given Number is Prime Number");
	}

}
