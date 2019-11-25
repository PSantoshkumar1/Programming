package com.collections;

import java.util.TreeMap;
import java.util.SortedMap;
public class TreeMap28 {
	public static void main(String[] args) {
		
		TreeMap<String, String> tm=new TreeMap<String,String>();
				
		tm.put("First", "Test");
		tm.put("Second", "Yantra");
		tm.put("Third", "Software");
		tm.put("fourth", "Solutions");
		
		tm.put("Sixth", "Employees");
		
		
		SortedMap sm = tm.subMap("First","third");		
		
		System.out.println("Sorted map contains  "  +sm);
	
	}
}
