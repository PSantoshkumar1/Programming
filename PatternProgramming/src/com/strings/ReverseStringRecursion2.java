package com.strings;

public class ReverseStringRecursion2 {
	
	
	 public static void reverseString(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
        	
        	
           System.out.println(str); 
        
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverseString(str.substring(0,str.length()-1)); 
        } 
    } 
    public static void main(String[] args)  
    { 
        String str = "TEsTyAnTra is a SoFtWaRe CoMpAnY"; 
        ReverseStringRecursion2 obj = new ReverseStringRecursion2(); 
        obj.reverseString(str); 
    }     

		
	}
