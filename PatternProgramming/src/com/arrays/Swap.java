package com.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Swap {
	public static void main(String[] args) {
		
		int [] a= {2,3,4,5,6,7,78,8,8,9,5,45,35};
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(6);
		al.add(0);
		al.add(12);
		al.add(44);
		System.out.println(al);
		
		Collections.swap(al, 3, 0);
		
		System.out.println(al);
		
		
	}

}
