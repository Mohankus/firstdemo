package com.business.lambdaDemo;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]=new String[15];
		String s="MOHAN";
		str[5]="JAVA OPTIONAL CLASS EXAMPLE";
		//Optional<String> op=Optional.ofNullable(str[5]);
		Optional<String> op=Optional.ofNullable(s);
		if(op.isPresent())
		{
			System.out.println("Available");
			String lower=s.toLowerCase();
			System.out.println(lower);
			System.out.println(op.get());
		}
		else
		{
			System.out.println("Not Available");
		}
		
	}

}
