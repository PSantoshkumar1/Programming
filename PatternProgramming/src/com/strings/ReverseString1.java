package com.strings;

public class ReverseString1 {
public static void main(String[] args) {
	
	String s="SoftWare";
	System.out.println("Before reverse name is ");
	System.out.println(s);
	System.out.println("after REversing name is ");
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print( s.charAt(i));
	}
	

}
}
