package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicate {
	public static void main(String[] args) {
		
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(10);
		
		HashSet hs = new HashSet();
		for(int i=0;i<ls.size();i++)
		{
			if(hs.add(ls.get(i)))
			{
				System.out.println("added");
			}
			else
			{
				System.out.println(ls.get(i));
				System.out.println("duplicate");
			}
}
	}
}
