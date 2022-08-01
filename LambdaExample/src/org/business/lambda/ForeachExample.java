package org.business.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=new ArrayList<String>();
		li.add("Mohan");
		li.add("Udhayan");
		li.add("Poorani");
		
		li.forEach(l->{
			System.out.println(li);
		});

	}

}
