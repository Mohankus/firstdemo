package com.business.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "cbacdcbc";
	    string.chars()
	            .mapToObj(item -> (char) item)
	            .collect(Collectors.toSet()).forEach(System.out::print);
	  
	    
	    
	    //Using String Buffer
	    
	    System.out.println("Using String Buffer");
	    
	    
	    String str="mohanaso";
	    
	    StringBuilder sb = new StringBuilder();
		// StringBuffer sb = new StringBuffer();

		str.chars().distinct().forEach(c -> sb.append((char) c));

		System.out.println(sb.toString());


		
	}

}
