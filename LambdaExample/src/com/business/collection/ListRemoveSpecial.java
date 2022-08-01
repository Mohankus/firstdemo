package com.business.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListRemoveSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		list.add("K3S_1M_2.4G~^@");
		list.add("Kinetis_Mfi^A for iOS9");
		
		list = list.stream().map(s -> s.replaceAll("[-+^~@^_.]*", ""))
		        .collect(Collectors.toList());
		System.out.println(list);
	}

}
