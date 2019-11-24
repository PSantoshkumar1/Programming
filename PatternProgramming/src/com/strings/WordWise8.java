package com.strings;

public class WordWise8 {
	
	 public void reverseWord(String str)
	   {
		String[] ws = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < ws.length; i++)
	        {
	           String word = ws[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
	   public static void main(String[] args) 
	   {
		WordWise8 obj = new WordWise8();
		obj.reverseWord("Selenium  is a free tool");
		obj.reverseWord("Github is also free to use for traniers ");
		obj.reverseWord("Mission Project");
	   }
}

