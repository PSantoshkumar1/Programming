package com.collections;

import java.util.ArrayList;

public class CopyToArry {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Santu");
		al.add("Putta");
		al.add("Chowdary");
		al.add("Kamma");
		System.out.println("ArrayList elements" );
		System.out.println(al);
		String [] str=new String[al.size()];
		al.toArray(str);
		System.out.println("Elements copied to Array");
		for(String s:str) {
			
		System.out.println(s);
	}
	}
}
