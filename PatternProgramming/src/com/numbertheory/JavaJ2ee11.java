package com.numbertheory;

public class JavaJ2ee11 {
	public static void main(String[] args) {
		
		int num=100;
		
		for(int i=1;i<=num;i++)
		{
			if(i%4 ==0 && i%5==0)
				System.out.println("Lara "+ i);
			else if (i%4==0)  
				System.out.println("java "+ i);
			else if(i%5==0) 
				System.out.println("J2ee  "+ i);
		}
	}

}
