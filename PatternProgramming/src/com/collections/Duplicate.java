package com.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Duplicate {
	/*
	 * public static int removeDuplicateElements(int arr[], int n){ if (n==0 ||
	 * n==1){ return n; } int[] temp = new int[n]; int j = 0; for (int i=0; i<n-1;
	 * i++){ if (arr[i] != arr[i+1]){ temp[j++] = arr[i]; } } temp[j++] = arr[n-1];
	 * for (int i=0; i<j; i++){ arr[i] = temp[i]; } return j; }
	 * 
	 * public static void main (String[] args) { int arr[] =
	 * {01,8,8,03,06,04,50,50}; int length = arr.length; length =
	 * removeDuplicateElements(arr, length); for (int i=0; i<length; i++)
	 * System.out.print(arr[i]+" "); }
	 */
    
    
    public static void main(String[] args) {
		
	
    ArrayList al=new ArrayList();
  al.add("santu");
  al.add("putta");
  al.add("chowdary");
  al.add("santu")
  /*al.add(1);
  al.add(2);
  al.add(3);
  al.add(1);
  al.add*/;
  
  TreeSet ts=new TreeSet(al);
  
  System.out.println(ts);
	}
}
