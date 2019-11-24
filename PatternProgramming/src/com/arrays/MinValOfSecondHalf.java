package com.arrays;

import java.util.Arrays;

public class MinValOfSecondHalf {
public static void main(String[] args) {
		
		
		int [] ar= {1,2,3,4,5,6,7,8,9,10};
		
		int n=ar.length ;
		Arrays.sort(ar);
		int min = ar[ar.length-1];
		
		for(int i=1;i<n;i++)
		{
			if(i>=n/2) {
				if(ar[i]<min) {
					 min=ar[i];
		}
		}
}
			 System.out.println(min);

			 }

}
