package com.strings;

public class EachWord19 {
	public void reverseWordInMyString(String str)
	   {
		String[] w = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < w.length; i++)
	        {
	           String word = w[i]; 
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
		EachWord19 obj = new EachWord19();
		obj.reverseWordInMyString("hai hello i am s/w engineer");
	   }
}
