package com.collections;

import java.util.ArrayList;

public class CopyOrClone01 {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Santu");
		al.add("Putta");
		al.add("Chowdary");
		al.add("Kamma");
		System.out.println("Elements of 1st ArrayList");
		System.out.println(al);
		ArrayList<String>al1=(ArrayList<String>)al.clone();
		System.out.println("Elements copied to second Arraylist");
		System.out.println(al1);
		
	}

}
