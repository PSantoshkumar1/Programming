package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
	public static void main(String[] args) {
		

		ArrayList<String> al=new ArrayList<String>();
		al.add("Santu");
		al.add("Putta");
		al.add("Chowdary");
		al.add("Kamma");
		System.out.println("ArrayList elements" );
		System.out.println(al);
		
		
		Collections.swap(al, 1, 2);
		System.out.println(al);
	}

}
