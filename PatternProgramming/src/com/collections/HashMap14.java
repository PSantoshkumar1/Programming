package com.collections;

import java.util.HashMap;

public class HashMap14 {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "Test");
		hm.put(2, "yantra");
		hm.put(3, "Company");
		hm.put(4, "Software");
		hm.put(5, "kothi");
		System.out.println("Elements of first MAp");
		System.out.println(hm);
		HashMap<Integer, String> hm1=new HashMap<Integer, String>(hm);
		
		System.out.println("ELements After copy");
		System.out.println(hm1);

	}
	
}
