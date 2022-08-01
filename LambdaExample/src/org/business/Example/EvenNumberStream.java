package org.business.Example;

import java.util.*;

public class EvenNumberStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(10,15,14,17,19);
		list.stream().filter(n->n %2==0).forEach(System.out::print);
		System.out.println();
		System.out.println("Start with 1");
		List<Integer> list1=Arrays.asList(10,25,54,17,19);
		list1.stream().map(s->s+"").filter(s -> s.startsWith("1")).forEach(System.out::print);
	
		
		System.out.println("Remove Duplicate");
		List<Integer> alist=Arrays.asList(10,21,13,21,45,13,56);
		HashSet<Integer> set=new HashSet<Integer>();
		alist.stream().filter(n->!set.add(n)).forEach(System.out::print);
		
		int max =  alist.stream()
                .min(Integer::compare).get();
		
		int sum=alist.stream().mapToInt(t->t).sum();
               
System.out.println("max--"+max);         
System.out.println("sum--"+sum);
	}

}
