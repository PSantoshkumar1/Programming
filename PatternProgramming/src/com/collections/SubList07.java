package com.collections;

import java.util.LinkedList;

public class SubList07 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("cake");
		ll.add("wade");
		ll.add("cakewade");
		ll.add("Pastery");
		ll.add("Normal");
		
		System.out.println(ll.subList(2, 4));
	}
}
