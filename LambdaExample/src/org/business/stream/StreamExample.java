package org.business.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productsList = new ArrayList<Product>();  
		productsList.add(new Product(1, "Mohan", 500f));
		productsList.add(new Product(2, "Udhayan", 400f));
		productsList.add(new Product(3, "Poorani", 300f));
		productsList.add(new Product(4, "Subu", 700f));
		productsList.add(new Product(5, "kumar", 100f));
		
		
		//List<Float> lf=productsList.stream().filter(p->p.price>400f)
		//.map(p->p.price).collect(Collectors.toList());
				
		
		productsList.stream()
				.filter(p->p.price>400)
				.forEach(p->System.out.println(p.name+ " "+p.price));
		
		//System.out.println(na);
System.out.println("Char occurance ");
		
		String str = "pooranior";
	    Map<Character, Integer> charCount = new HashMap<>();
	    for (char c : str.toCharArray()) {
	        charCount.merge(c,          // key = char
	                1,                  // value to merge
	                Integer::sum);      // counting
	    }
	    System.out.println("Char Counts:\n" + charCount);
		
	}

}
