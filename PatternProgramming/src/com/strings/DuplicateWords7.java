package com.strings;

public class DuplicateWords7 {
	public static void main(String[] args) {
		String str = "Test is Software company SoftWare company is a it company Test ";

		int count;
		
		str =str.toLowerCase();

		String words[] = str.split(" ");

System.out.println(str);
System.out.println("|||||||||||");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0")
				System.out.println(words[i] + "  is a duplicate word and Occuring -> "+ count  +"  times");
		}
	}

}
