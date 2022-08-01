package com.business.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
		
		String str[]= {"mohan","udhayan","subu","poorani","mohan","subu"};
		
		//List<String>list=Arrays.asList(str);
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		
		Map<String,Long>map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		int[] array = {0,1,2,3,4,5,6,7,8,9}; 
		int[] a = Arrays.copyOfRange(array, 0, 4); //<- (targetArray, start, to)
		int[] b = Arrays.copyOfRange(array, 4, array.length);
//	    int[] array2 = Arrays.copyOfRange(array, 1, 2);
//	    int[] array3 = Arrays.copyOfRange(array, 2, 3);
//	    int[] array4 = Arrays.copyOfRange(array, 3, 4);
	    System.out.println("Array--"+a);
		/*
		 * System.out.println(array2[0]); System.out.println(array3[0]);
		 * System.out.println(array4[0]);
		 */

	}

}
