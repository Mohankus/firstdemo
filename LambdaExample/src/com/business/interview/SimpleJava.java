package com.business.interview;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(null);
		
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("123_test.txt"); 
		al.add("234_file1.txt") ;
		
		
		for(String str: al)
		{
            String[] c= str.split("_");
            System.out.println(c[0]);
		System.out.println(c[1]);
		}
	}
	public static void method(Object o) 
	{
	System.out.println("Object method");
	}
	public static void method(String s) 
	{
	System.out.println("String method");
	}
	
	

}
