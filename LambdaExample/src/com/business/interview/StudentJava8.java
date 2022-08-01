package com.business.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"mohan"));
		list.add(new Student(2,"subu"));
		list.add(new Student(3,"udhayan"));
		list.add(new Student(4,"poorani"));
		list.add(new Student(5,"moorthi"));
		list.add(new Student(6,"raj"));
		list.add(new Student(7,"kumar"));
		
		List<Student>stu=list.stream().filter(l->l.getId()>=3).collect(Collectors.toList());
		//System.out.println(stu.get(1).getId());
		for(Student st:stu)
		{
			System.out.println(st.getId()+" "+st.getName());
		}
		
	
		List<Integer> itemList = new ArrayList<Integer>();
        itemList.add(2);
        itemList.add(12);
        itemList.add(1);
        itemList.add(14);
        itemList.add(8);

       /* int[] itemsArray = new int[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);*/
        int[] itemsArray = new int[itemList.size()];

       for(int i=0;i<itemsArray.length;i++)
       {
    	   itemsArray[i]=itemList.get(i);
       }
       for(int j=0;j<itemsArray.length;j++)
       {
    	  System.out.println(itemsArray[j]);
       }
       
       
       Set<String> set=new HashSet<String>();
       set.add("peter");
       set.add("priya");
       set.add("Peter");
       set.add("PETER");
       set.add("peter");
       System.out.println("set.size()-->"+set.size());
       System.out.println(set);
       for (String value : set)
       {
           // Printing all the values inside the object 
           System.out.print(value.hashCode()+" "+value + ", ");
         
       System.out.println();
   }
	}

}
