 package com.business.interview;

import java.util.*;
import java.util.stream.Collectors;

public class StringCountLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strArr[]=new String [] {"mohan","udhayan","poorani","subu"};
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee("mohan",32,2000,"dev"));
		list.add(new Employee("poorani",33,1000,"test"));
		list.add(new Employee("udhayan",30,7000,"dev"));
		list.add(new Employee("poorani",34,5000,"query"));
		
		//list.stream().filter(i->i.getDepartment()).distinct().collect(Collectors.toList());
		List<String> out=list.stream()
				.map(m->m.getDepartment()).distinct()
	            // .map(Employee::getDepartment).distinct()
	             //.forEach(System.out::println);
	             //.forEach(p->System.out.println(p.price));
			//.map(p->p.department)
			.collect(Collectors.toList());
	System.out.println("out-->"+out);
	
	
	Employee user1 = list.stream().filter(i->i.getDepartment()=="dev")
            .max(Comparator.comparingInt(Employee::getSalary))
            .get();

System.out.println("Based on Department get the value " + user1.getSalary()+" "+user1.getDepartment());



Employee user2 = list.stream()
        .max(Comparator.comparingInt(Employee::getSalary))
        .get();

System.out.println("Based on salary get the value " + user2.getSalary()+" "+user2.getName());
	
	List<String> out1=list.stream().filter(i->i.getDepartment()=="dev")
			
            .map(Employee::getDepartment)
            //.forEach(System.out::println);
            //.forEach(p->System.out.println(p.price));
		//.map(p->p.department)
		.collect(Collectors.toList());
System.out.println("out-->"+out1);
	
	
		
		// Sum of the number
		
		int sum=list.stream().mapToInt(i->i.getSalary()).sum();
		System.out.println("Sum of no.."+sum);
		
		//square the list of numbers and then filter out the numbers greater than 100 
		//and then find the average of the remaining numbers?
		
		System.out.println("square the list of numbers");
		
		list.stream().map(x -> x.getAge() * x.getAge()).filter(n-> n>100)
				.forEach(nam->System.out.println("nam-->"+nam));
		
		System.out.println("find the lowest and highest number of a Stream");
		List <Integer> list1 = Arrays.asList(40, 32, 53, 22, 11, 89, 76);
		OptionalInt max=list1.stream().mapToInt(value->value).max();
		System.out.println(max);
		
		System.out.println("Sorting***");
		
		list.stream().map(k->k.getAge()).sorted().collect(Collectors.toList())
		.forEach(m->System.out.println(m));
		
		
		
		
		
		/*
		 * Random r=new Random();
		 * r.ints().limit(5).sorted().forEach(System.out::println);
		 */		
		
		System.out.println("find the number of Strings in a list whose length is greater than 5**");
		
		//long count=list.stream().map(b->b.getSalary()).count();
		long count=list.stream().filter(b->b.getName().length()>=5).count();
		System.out.println(count);
		
		System.out.println("Occrance of String");
		
		String strName="javalanguage";
		
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		for(char c:strName.toCharArray())
		{
			countChar.merge(c, 1, Integer::sum);
		}
		System.out.println("Occrance of String-->"+countChar);
		
		/*
		 * Map<Character,Long>
		 * result=strName.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->
		 * c,Collectors.counting())); result.forEach((k,v)->{ if(v>1)
		 * System.out.println(k +"  "+v); });
		 */		
		
		System.out.println("Count the no.of employee with same name and age >30");
		
		Map<String,Long> strCount=list.stream().filter(m->m.getAge()>30).
				collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
	                             System.out.println(strCount);
	                             
	                             Map<String,Long> strCount1=list.stream().filter(m->m.getDepartment()=="dev").
	                     				collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	                     	                             System.out.println(strCount1);
		
	}

}
