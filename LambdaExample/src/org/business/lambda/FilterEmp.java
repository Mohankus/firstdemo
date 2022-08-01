package org.business.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("mohan",34,2000));
		emp.add(new Employee("poorani",24 ,5000));
		emp.add(new Employee("udhayn", 32,  9000));
		emp.add(new Employee("subu",33, 7000));
		//System.out.println(emp.toString());
		//List<String> list=
				emp.stream()
		    .map(Employee::getName)
		    .forEach(System.out::println);
		    //.map(e->e.getName())
		    //.collect(Collectors.toList());
		    //list.forEach(name->System.out.println(name));
		    //.forEach(System.out::println);
		
		//System.out.println("Mohan"+list);
	}

}
