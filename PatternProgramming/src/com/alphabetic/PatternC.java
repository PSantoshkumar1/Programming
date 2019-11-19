package com.alphabetic;

public class PatternC {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			if(i==0||j==0||i==5-1)
			{
			System.out.print("C");
			}
			else
				System.out.print(" ");
		}
			System.out.println();
	}

}
}
