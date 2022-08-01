package com.business.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMutableImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
		
	       //initialize an immutable list from array using asList method
	        List<String> mylist = Arrays.asList(strArray);
	        //print the list
	        System.out.println("Immutable list we can't add the elements to list once again:");
	        //mylist.add("Pune");
	        for(String val : mylist){
	           System.out.print(val + " ");
	        }
	        
	        System.out.println("\n");
	        
	        //initialize a mutable list(arraylist) from array using asList method
	        List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
	        System.out.println("Mutable list: we can add the elements to list once again");
	        //add one more element to list
	        arrayList.add("Pune");
	        //print the arraylist
	          for(String val : arrayList){
	          System.out.print(val + " ");	
	          
	         

	        }
	         
	}

}
