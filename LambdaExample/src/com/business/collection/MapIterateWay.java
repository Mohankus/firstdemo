package com.business.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterateWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> map = new HashMap<Integer,String>();
		 map.put(1, "mohan");
		 map.put(2, "kumar");
		 map.put(3, "poorani");
		 map.put(4, "udhayan");
		 map.put(5, "subu");
		 
		 
		// using for-each loop
		 
		 for(Map.Entry<Integer,String> entry: map.entrySet())
		 {
			 System.out.println(entry.getKey()+ "  "+entry.getValue());
		 }
		 
		 
		 // using iterators
		 
		 Iterator<Map.Entry<Integer,String>> itr= map.entrySet().iterator();
		 while(itr.hasNext())
		 {
			 Map.Entry<Integer,String> entry1=itr.next();
			 System.out.println(entry1.getKey()+" "+entry1.getValue());
					 
		 }
		 
		 
		 
		 
	}

}
