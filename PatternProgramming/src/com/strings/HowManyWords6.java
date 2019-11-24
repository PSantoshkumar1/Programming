package com.strings;

public class HowManyWords6 {
public static void main(String[] args) {
	
	String s="Bagalkote is a colourfull city";
	int count =0;
	String[] arr=s.split(" ");
	for(String s1:arr) {
		count++;
	}
	System.out.println(count);
}
}
