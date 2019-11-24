package com.sample;

public class Add {

    static int Addd(int x, int y) 
    { 
        while (y != 0)  
        { 
            int carry = x & y; 
  
            x = x ^ y; 
  
            y = carry << 1; 
        } 
        return x; 
    } 
      
    public static void main(String arg[])  
    { 
        System.out.println(Addd(15, 32)); 
    } 
} 

