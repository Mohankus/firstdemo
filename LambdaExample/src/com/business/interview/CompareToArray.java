package com.business.interview;

import java.util.stream.Stream;

public class CompareToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]={1,2,3,4};
		Integer b[]={9,8,2,3};
		for(Integer b1:b) {
		    Stream.of(a).filter(a1 -> (a1.compareTo(b1) ==0)).forEach(System.out::println);
		    }

	}

}
