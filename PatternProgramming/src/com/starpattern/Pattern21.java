package com.starpattern;

public class Pattern21 {

	public static void main(String[] args) {
         
	         int n=7;
	         
	         
	        for (int i = 1; i <= n; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            { 
	                System.out.print(j+" "); 
	            } 
	             
	            System.out.println(); 
	        } 
	         
	         
	        for (int i = n-1; i >= 1; i--)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	         
	         
	    }
	}

