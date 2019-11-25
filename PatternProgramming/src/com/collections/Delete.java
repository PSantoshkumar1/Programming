package com.collections;

import java.util.Collections;
import java.util.HashMap;

public class Delete {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();

		hm.put(1, "Test");
		hm.put(2, "yantra");
		hm.put(3, "Company");
		hm.put(4, "Software");
		hm.put(5, "kothi");
		
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
	}

}
