package com.business.collection;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>alist1=new ArrayList<String>();
		alist1.add("mohan");
		alist1.add("udhayan");
		alist1.add("poorani");
		alist1.add("subu");
		ArrayList<String>alist2=new ArrayList<String>();
		alist2.add("a");
		alist2.add("b");
		alist2.add("c");
		alist2.add("d");
		ArrayList<String>alist3=new ArrayList<String>();
		alist3.add("x");
		alist3.add("y");
		alist3.add("z");
		alist3.add("w");
		
		
		
		
		Map<Integer,List<String>> maplist=new HashMap<Integer,List<String>>();
		
		maplist.put(1, alist1);
		maplist.put(2, alist2);
		maplist.put(3, alist3);
		
		for(Map.Entry<Integer,List<String>> en1:maplist.entrySet()) 
		{
			System.out.println("listASvalue--.Key "+en1.getKey());
			System.out.println("listASvalue--.values "+en1.getValue());
		}
		
		Iterator<Map.Entry<Integer,List<String>>> en2=maplist.entrySet().iterator();
		while(en2.hasNext())
		{
			Map.Entry<Integer,List<String>>en3=en2.next();
			System.out.println(en3.getKey()+ "      "+en3.getValue());
		}
		

	Map<ArrayList<String>,Integer> map=new HashMap<ArrayList<String>,Integer>();
	
	

	
	map.put(alist1, 1);
	map.put(alist2, 2);
	map.put(alist3, 5);
	
	
	for(Map.Entry<ArrayList<String>,Integer> d1:map.entrySet())
	{
		System.out.println(d1.getKey()+"                 "+d1.getValue());
	}
	
	LocalDate start = LocalDate.of(1988, 6, 21);
	LocalDate end = LocalDate.of(2022, 7, 15); // use for age-calculation: LocalDate.now()
	long years = ChronoUnit.YEARS.between(start, end);
	System.out.println(years); // 17
	
	
	
	
	
	}

}
