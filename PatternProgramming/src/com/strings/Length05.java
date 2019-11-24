package com.strings;

public class Length05 {
	
	public static void main(String[] args) {
		
		String str="TestYantra is a software company";
		int i=0;
		for(char s :str.toCharArray())
		{
i++;
		}
		System.out.println("Length of given String is : "+ i);
	}
}
