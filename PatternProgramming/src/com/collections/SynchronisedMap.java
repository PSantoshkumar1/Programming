package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronisedMap {
	public static void main(String[] args) {
		
	
	 HashMap<Integer, String> hm= new HashMap<Integer, String>();
     hm.put(1, "Arun");
     hm.put(2, "timmma");
     hm.put(3, "sunil");
     hm.put(4, "vijay");
     hm.put(5, "vinod");

     Map map= Collections.synchronizedMap(hm);
     Set set = map.entrySet();
     synchronized(map){
         Iterator i = set.iterator();
         while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
         }
     }
}

}
