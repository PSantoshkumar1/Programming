package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorReverse {
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("test");
		ll.add("yantra");
		ll.add("Software");
		ll.add("company");
		ll.add("employee");
		ll.add("salary");
		System.out.println(ll);
		
		Iterator<String> t = ll.descendingIterator();
		while(t.hasNext())
			System.out.println(t.next());

	}

}
