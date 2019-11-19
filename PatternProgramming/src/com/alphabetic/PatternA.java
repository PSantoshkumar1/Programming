package com.alphabetic;

public class PatternA {

	public static void main(String[] args) {

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			if(i==0||j==0||j==5-1||i==5/2)
			{
			System.out.print("A");
			}
			else
				System.out.print(" ");
		}
			System.out.println();
}
	}
}
		