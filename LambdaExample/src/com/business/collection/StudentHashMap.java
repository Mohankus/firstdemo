package com.business.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("mohan",1);
		Student s2=new Student("mohan",1);
		
		Map<Student,String> map=new HashMap<Student,String>();
		map.put(s1, "poorani");
		map.put(s2, "poorani");
		System.out.println(map.size());//output 2

	}

}
