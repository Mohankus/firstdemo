package org.business.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExampleJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> arr=Arrays.asList("mohan","do","poorani","as","kumar");
		
		List<String> sorted=arr.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("s1->s2"+sorted);
				//.forEach(e->System.out::println);
		
		List<String> sorted1=arr.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(sorted1);
		
		//Using Sorted and Map
		System.out.println("**Using Sorted and Map**");
		arr.stream().sorted().map(v->v).forEach(System.out::println);
		
	}

}
