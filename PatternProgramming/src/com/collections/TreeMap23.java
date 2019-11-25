package com.collections;

import java.util.TreeMap;

public class TreeMap23 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "First");
		tm.put(2, "Second");
		tm.put(3, "Third");
		tm.put(4, "Fourt");
		tm.put(5, "Fifth");
		
		
		TreeMap<Integer, String> tm1=new TreeMap<Integer, String>(tm);
          System.out.println(tm1);
	}
}
