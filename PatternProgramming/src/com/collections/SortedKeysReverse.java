package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortedKeysReverse {
	public static void main(String[] args) {
		

		TreeMap<String, String> tm=new TreeMap<String,String>();
		
		tm.put("First", "Test");
		tm.put("Second", "Yantra");
		tm.put("Third", "Software");
		tm.put("fourth", "Solutions");
		tm.put("Sixth", "Employees");
		
		System.out.println("Tree map before reverse ");
		System.out.println(tm);
		
		Map<String, String> rm = tm.descendingMap();
		
		System.out.println("After Reverse");
		System.out.println(rm);
		
	}

}
