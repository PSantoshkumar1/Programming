package com.collections;

import java.util.HashSet;

public class Set12 {
public static void main(String[] args) {
	
	HashSet<String> hs=new HashSet<String>();
	hs.add("null");
	hs.add("Kalyan");
	hs.add("prudhvi");
	hs.add("siddu");
	hs.add("linga");
	hs.add("prabhu");
	hs.add("sri devi");
	System.out.println("Elements of first HashSet");
	System.out.println(hs);
	HashSet<String> hs1=new HashSet<String>(hs);
	System.out.println("Elements of Second HashSet");
	System.out.println(hs1);
	
}
}
