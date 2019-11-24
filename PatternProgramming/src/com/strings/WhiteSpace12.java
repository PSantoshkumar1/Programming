package com.strings;

public class WhiteSpace12 {
	 public static void main(String[] args) 
	    { 
	        String str = "      Testing  is  a  Skill  cant copy      "; 
	       
	        str = str.replaceAll("\\s", ""); 
	       
	        System.out.println(str); 
	    } 

}
