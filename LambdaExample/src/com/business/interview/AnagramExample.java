 package com.business.interview;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="RAM";
		String str2="ARM";
		
		if(str1.length()==str2.length())
		{
			
			char c1[]=str1.toCharArray();
			
			Arrays.sort(c1);
			char c2[]=str2.toCharArray();
			Arrays.sort(c2);
			
			System.out.println(c1);
			System.out.println(c2);
			
			System.out.println(Arrays.equals(c1, c2));
			
		}

	}

}
