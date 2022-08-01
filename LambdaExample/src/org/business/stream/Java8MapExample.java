package org.business.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list=new ArrayList<String>(Arrays.asList(new String[] {"1","2","3","4","5"}));
		
		list.stream().map(Integer::valueOf).forEach(System.out::println);
	}

}
