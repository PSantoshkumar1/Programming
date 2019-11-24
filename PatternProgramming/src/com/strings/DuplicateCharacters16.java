package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters16 {
//	public static void main(String argu[]) {
//
//		  String str = "ttestyantraandtestyantra";
//		  int cnt = 0;
//		  char[] inp = str.toCharArray();
//		  System.out.println("Duplicate Characters are:");
//		  for (int i = 0; i < str.length(); i++) {
//		   for (int j = i + 1; j < str.length(); j++) {
//		    if (inp[i] == inp[j]) {
//		    	
//		     System.out.println(inp[j]);
//		     cnt++;
//		     break;
//		    }
//		   }
//		  }
//		 }
	public void findIt(String str) {  
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
      for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            } else {  
             baseMap.put(ch, 1);  
            }  
       }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
    }     
    public static void main(String a[]) {  
        DuplicateCharacters16 dcf = new DuplicateCharacters16();  
        dcf.findIt("ttestyantraandtestyantra");  
    }  
}
