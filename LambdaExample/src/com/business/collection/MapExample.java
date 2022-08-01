package com.business.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Integer,String> map=new HashMap<>();
//		map.put(1,"af");
//		map.put(2,"bx");
//		map.put(3,"cd");
//		
//		for(Entry<Integer, String> em:map.entrySet())
//		{
//			System.out.println(em.getKey()+" "+em.getValue());
//		}
//		
//		Iterator<Entry<Integer, String>> em1=map.entrySet().iterator();
//		while(em1.hasNext())
//		{
//			Entry<Integer, String> em2=em1.next();
//			System.out.println(em2.getKey()+" "+em2.getValue());
//		}
		
		System.out.println();
		System.out.println();
		
		Emp emp1 = new Emp(1,"sandhiya","cse",22);
		Emp emp2 = new Emp(1,"sandhiya","cse",22);
		Emp emp3 = new Emp(1,"sandhiya","cse",22);
		Emp emp4 = new Emp(1,"sandhiya","cse",22);
		Emp emp5 = new Emp(1,"sandhiya","cse",22);
		HashSet<Emp> emps = new HashSet<Emp>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		System.out.println("Size--->"+emps.size());
		for(Emp e: emps){
			System.out.println("HashCode-->"+e.hashCode());
		    System.out.println(e.getId() + " "+e.getName()+" "+e.getDep()+ " "+e.getAge());
		}
		
		System.out.println();
		System.out.println("HashMap-->");
		
		Student s1=new Student("mohan", 1);
		Student s2=new Student("mohan", 1);
		HashMap<Student, String> map2=new HashMap<Student, String>();
		map2.put(s1, "subu");
		map2.put(s2, "udhayan");
		
		System.out.println("Size hashaMap-->"+map2.size());
		for(Entry<Student, String> emps1:map2.entrySet())
		{
			Student s11=emps1.getKey();
			System.out.println("Key-->"+s11.getId()+" "+s11.getName()+"  hashcode "+s11.hashCode());
			System.out.println("Value-->"+emps1.getValue());
		}
		


	}

}
