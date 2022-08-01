package com.business.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class SelfCheckMohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("mohanas", 33, 50000, "cse"));
		emp.add(new Employee("subu", 31, 70000, "cse"));
		emp.add(new Employee("udhayan", 30, 90000, "mech"));
		emp.add(new Employee("poorani", 23, 60000, "it"));
		emp.add(new Employee("mohanas",33, 60000, "cse"));
		
		
		int a[]= {1,5,12,25,9};
		
		//Using foreach
		emp.stream().map(m->m.getDepartment()).distinct().forEach(System.out::println);
		
		//Using Collecter
		emp.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList())
				.forEach(System.out::println);;
		//System.out.println(dep);
		
				//Max element
				OptionalInt maxEle=emp.stream().mapToInt(Employee::getAge).max();
				System.out.println("Max element-->"+maxEle);
				Employee max=emp.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
				System.out.println("Max element------->"+max.getName()+" "+max.getSalary());
				
				//Filter
				System.out.println("Filter***");
				List<String> name=emp.stream().filter(f->f.getDepartment()=="cse").map(Employee::getName).collect(Collectors.toList());
				System.out.println(name);
				
				//Sum
				System.out.println("Sum of the value");
				int totalSalary=emp.stream().mapToInt(Employee::getSalary).sum();
				System.out.println(totalSalary);
				
				int sum=emp.stream()
					     .collect(Collectors.summingInt(Employee::getSalary));
					System.out.println(sum);
				
				//Squre
				System.out.println("Squre**");
				emp.stream().map(x->x.getAge()*x.getAge()).filter(n->n>1000).forEach(System.out::println);
				
				
				// Find Highest and lowest
				List<Integer> search=Arrays.asList(12,58,36,9,20);
				OptionalInt searchMax=search.stream().mapToInt(value->value).min();
				System.out.println(searchMax);
		
				//Sorting
				System.out.println("Sorting value");
				List<Integer> sort=Arrays.asList(12,58,36,9,20);
				
				sort.stream().map(value->value).sorted().forEach(System.out::println);
				System.out.println("Pojo");
				List<Integer> emplist=emp.stream().map(Employee::getAge).sorted().collect(Collectors.toList());
				System.out.println(emplist);
				
				//find the number of string in list and whose length 5
				
				List<String>emplist1=emp.stream().map(m->m.getName()).filter(k->k.length()>5).collect(Collectors.toList());
				System.out.println(emplist1);
				
				List<String> stringLengt=Arrays.asList("mohanas","supu","valarmathi","priya");
				List<String>sl=stringLengt.stream().filter(k->k.length()<=4).collect(Collectors.toList());
				System.out.println(sl);
				
				System.out.println("Count the character");
				//Count the character 
				String str1="JavaMohan";
				char c='o';
				long count=str1.chars().filter(k->k==c).count();
				System.out.println(count);
				
				String str2="Java Mohan";
				
				Map<Character,Integer> charCount=new HashMap<Character, Integer>();
				
				for(char c1:str2.toCharArray())
				{
					charCount.merge(c1, 1, Integer::sum);
				}
				System.out.println(charCount);
				
                System.out.println("****groupingBy*****");
				Map<String,Long> strCount=emp.stream().filter(m->m.getAge()>30).
						collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
			                             System.out.println(strCount);
			                             
				System.out.println("Start with");
				List<String> startWith=Arrays.asList("mohan","subu","poorani","udhayan","salem");
				startWith.stream().filter(k->k.startsWith("s")).forEach(System.out::println);
				
				System.out.println("EvenNumber");
				List<Integer> evenNumber=Arrays.asList(12,5,17,20);
				
				evenNumber.stream().filter(k->k%2==0).forEach(System.out::println);
				
				

	}

}
