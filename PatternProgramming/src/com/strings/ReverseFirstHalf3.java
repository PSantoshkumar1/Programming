package com.strings;

public class ReverseFirstHalf3 {
public static void main(String[] args) {
	

	String s="SoftWare";
	for(int i=s.length()/2-1;i>=0;i--) {
		System.out.print( s.charAt(i));
	}
	System.out.print(" ");
	for(int i=s.length()-1;i>=s.length()/2;i--)
{
	System.out.print( s.charAt(i));
	
}
}
}
