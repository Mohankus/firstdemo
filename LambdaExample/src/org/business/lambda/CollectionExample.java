package org.business.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list=new ArrayList<Product>();
		
		list.add(new Product(1,"Mohan",900) );
		list.add(new Product(2,"kumar",700) );
		list.add(new Product(3,"udhayan",900) );
		list.add(new Product(4,"subu",300));
		
		List<Integer> out=list.stream().filter(p->p.getPrice()>300)
				
		             //.map(Product::getName)
		             //.forEach(System.out::println);
		             //.forEach(p->System.out.println(p.price));
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println("out-->"+out);
		
		//sum
		
		int sum=list.stream()
		     .collect(Collectors.summingInt(p1->p1.price));
		System.out.println(sum);
		
		//Duplicate
		System.out.println("***Duplicate***");
		List<Integer> li = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set<Integer> result=li.stream()
		.filter(p->Collections.frequency(list, p)>1)
		.collect(Collectors.toSet());
		 li.forEach(System.out::println);
		
	}

}
