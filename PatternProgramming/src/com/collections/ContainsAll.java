package com.collections;

import java.util.ArrayList;

public class ContainsAll {
	public static void main(String[] args) {
		
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("Santu");
	al.add("Putta");
	al.add("Chowdary");
	al.add("Kamma");
	//System.out.println("Elements of 1st ArrayList");
	System.out.println(al.containsAll(al));
}
}
