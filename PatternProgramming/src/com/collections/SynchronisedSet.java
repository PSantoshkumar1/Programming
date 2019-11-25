package com.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronisedSet {
	  
    public static void main(String a[]){
         
        Set<String> ss = new HashSet<String>();
        Set<String> s = Collections.synchronizedSet(ss);
        System.out.println("Synchronized created...");

}
}
