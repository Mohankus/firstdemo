package com.business.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoMohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("mohanas", 34, 50000, "cse"));
		emp.add(new Employee("subu", 31, 70000, "cse"));
		emp.add(new Employee("udhayan", 30, 90000, "mech"));
		emp.add(new Employee("poorani", 23, 60000, "it"));
		emp.add(new Employee("mohanas",33, 60000, "cse"));
		
		List<Employee>e0=emp.stream().filter(m->m.getSalary()>60000).collect(Collectors.toList());
		for(Employee d1:e0)
		{
			System.out.println(d1.getName()+" "+d1.getAge()+" "+d1.getSalary()+" "+d1.getDepartment());
		}
		Set<Emp> set=new HashSet<>();
		set.add(new Emp(1, "ravi", 200, "cse"));
		set.add(new Emp(2, "ravi", 200, "cse"));
		set.add(new Emp(1, "ravi", 200, "cse"));
	System.out.println("set Size-->"+set.size());
		
		int MaxSalary3rd=emp.stream().map(Employee::getSalary).sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(3);
		System.out.println("MaxSalary3rd-->"+MaxSalary3rd);
		
		List<Integer>int1=emp.stream().map(Employee::getSalary).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("int1->"+int1);
		
		int MaxSalary3rd1=emp.stream().map(Employee::getSalary).sorted(Collections.reverseOrder()).skip(2).limit(3).findFirst().get();
		System.out.println("MaxSalary3rd1-->"+MaxSalary3rd1);
/*
 List<Employee2> emp1=new ArrayList<Employee2>(); 
 List<Skill> skill=new ArrayList<Skill>(); 
 skill.add(new Skill(1,"java")); 
 skill.add(new Skill(2,"python"));
 skill.add(new Skill(3,"java")); 
 skill.add(new Skill(4,"c++")); 
 skill.add(new Skill(5,"c")); 
 emp1.add(new  Employee2("mohanas", 34, 50000, "cse",skill)); 
 emp1.add(new Employee2("subu",31, 70000, "cse",skill)); 
 emp1.add(new Employee2("udhayan", 30, 90000,"mech", skill)); 
 emp1.add(new Employee2("poorani", 23, 60000, "it", skill));
 emp1.add(new Employee2("mohanas",33, 60000, "cse", skill));

List<Employee2>
emp2=emp1.stream().filter(m->m.getSkill().getS_name()=="java").collect(
Collectors.toList()); System.out.println(emp);
		*/
			
		
	//FlatMap Example
		
		
		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja"); 
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad"); 
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori"); 
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf"); 
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan"); 
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");
		
		List<List<String>> playersInWorldCup2016 = new ArrayList<>();
		playersInWorldCup2016.add(teamIndia); 
		playersInWorldCup2016.add(teamAustralia); 
		playersInWorldCup2016.add(teamEngland); 
		playersInWorldCup2016.add(teamNewZeland); 
		playersInWorldCup2016.add(teamSouthAfrica); 
		playersInWorldCup2016.add(teamWestIndies); 
		playersInWorldCup2016.add(teamSriLanka); 
		playersInWorldCup2016.add(teamPakistan);
		
		
		 // Using flatMap for transformating and flattening. 
		
		List<String> player=playersInWorldCup2016.stream().flatMap(m->m.stream()).collect(Collectors.toList());
		System.out.println("player list-->"+player);
		
		List<String> flatlist = Arrays.asList("Geeks", "GFG","GeeksforGeeks", "gfg");

// Using Stream flatMap(Function mapper)
		flatlist.stream().flatMap(str ->Stream.of(str.charAt(2))).forEach(System.out::println);
			
		
		String[][] dataArray = new String[][]{{"a", "b"},{"c", "d"}, {"e", "f"}, {"g", "h"}};
		
		List<String>listofAllChars=Arrays.stream(dataArray).flatMap(x->Arrays.stream(x)).collect(Collectors.toList());
		System.out.println("listofAllChars-->"+listofAllChars);
		
		
		List<Integer> listArray=new ArrayList<Integer>(Arrays.asList( new Integer[] {1,2,3,4,5,6}));
		List<String> addString=Arrays.asList("mohan","udhayan","poorani","poorani","mohan");
		
		HashSet<String> addString1=new HashSet<String>();
		Set<String>addString12=addString.stream().filter(m->!addString1.add(m)).collect(Collectors.toSet());
		System.out.println("addString12-->"+addString12);
		
		
		Map<Integer,Integer> listMap=emp.stream().collect(Collectors.toMap(Employee::getAge, Employee::getSalary));
		System.out.println("listMap-->"+listMap);
		
		
		
		
		
		List<String>list=emp.stream().map(m->m.getDepartment()).sorted().distinct().collect(Collectors.toList());
		System.out.println(list);
		
		//Sum
		int s=emp.stream().mapToInt(Employee::getSalary).sum();
		System.out.println(s);
		Integer arr[]= {1,2,3,4,5,6};
		List<Integer> evenInt=Arrays.asList(arr);
		List<Integer>evenInt1=evenInt.stream().filter(m->m%2==0).collect(Collectors.toList());
		System.out.println("evenInt-->"+evenInt1);
		int m1=0;
		for(Integer I1:evenInt1)
		{
			m1=m1+I1;
		}
		System.out.println(m1);
		
				
		int sum=emp.stream().collect(Collectors.summingInt(m->m.getSalary()));
		System.out.println(sum);
		
		//Max
		Employee e=emp.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getSalary());
		
		OptionalInt max=emp.stream().mapToInt(m->m.getAge()).max();
		System.out.println("max-->"+max);
		
		List<Integer> list1=Arrays.asList(55,85,25,10,99);
		list1.stream().map(v->v).sorted().distinct().forEach(System.out::println);
		
		String str1="mohanas java";
		
		char c='a';
		long count=str1.chars().filter(m->m=='a').count();
		System.out.println(count);
		
		Map<Character,Integer> countNo=new HashMap<Character,Integer>();
		for(char c1:str1.toCharArray())
		{
			countNo.merge(c1, 1, Integer::sum);
		}
		System.out.println(countNo);
		
		Map<String,Long> strCount=emp.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));	
		System.out.println("strCount-->"+strCount);
		
	}

}
