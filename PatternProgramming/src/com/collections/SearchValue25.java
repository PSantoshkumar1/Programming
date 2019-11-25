package com.collections;

import java.util.TreeMap;

public class SearchValue25 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "First");
		tm.put(2, "Second");
		tm.put(3, "Third");
		tm.put(4, "Fourt");
		tm.put(5, "Fifth");
		
		System.out.println(tm);
		System.out.println(tm.containsValue("Third"));

}
}
