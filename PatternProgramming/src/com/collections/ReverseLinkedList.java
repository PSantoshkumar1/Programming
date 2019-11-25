package com.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("test");
		ll.add("yantra");
		ll.add("Software");
		ll.add("company");
		ll.add("employee");
		ll.add("salary");
		System.out.println(ll);
		
		Collections.reverse(ll);
		
		System.out.println(ll);
	
	}
}
