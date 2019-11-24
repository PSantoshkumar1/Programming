package com.strings;

public class RotateOneChar4 {
	public static void main(String[] args) {
		String[] str= {"Yeshvanthpur"};
		int temp=0;
		
		String t=str[str.length-1];
		for(int i=str.length-1;i>=0;i--)
		{
			if(i==0)
			{
				str[i]=t;
			}
			else {
				str[i]=str[i-1];
				
			}
		}
			
			for (int j = 0; j < str.length; j++) {
				System.out.print(" "+str[j]);
			}
			
	}

}
