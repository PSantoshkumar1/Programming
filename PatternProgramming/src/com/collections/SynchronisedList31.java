package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronisedList31 {
	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();

		li.add("Santu");
		li.add("madhusudan");
		li.add("kalim");
		li.add("punith");
		li.add("rakee");
		li.add("sangu");
		li.add("krishna");

		System.out.println(li);

		li = Collections.synchronizedList(li);
		synchronized (li) {
			Iterator<String> itr = li.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		}
	}
}
