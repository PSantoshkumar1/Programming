package com.collections;

import java.util.TreeMap;

public class FirstKey29 {
	public static void main(String[] args) {
		
		
		TreeMap<String, String> tm=new TreeMap<String,String>();
		
		tm.put("First", "Test");
		tm.put("Second", "Yantra");
		tm.put("Third", "Software");
		tm.put("fourth", "Solutions");
		tm.put("Sixth", "Employees");
		System.out.println(tm.firstKey());
		
	}

}
