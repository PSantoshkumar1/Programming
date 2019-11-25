package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxElements {
	public static void main(String[] args) {
	         
	        List<Integer> li = new ArrayList<Integer>();
	        li.add(1);
	        li.add(2);
	        li.add(3);
	        li.add(4);
	        li.add(5);
	        li.add(6);
	        System.out.println("Maximum element from the list: "+Collections.max(li));
	}

}
