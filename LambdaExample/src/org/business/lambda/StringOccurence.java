package org.business.lambda;

public class StringOccurence {

	public static long count(String str,char c)
	{
		return str.chars()
				.filter(m -> m == c)
				.count();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Chennain";
		char c='n';
		
		System.out.println(count(str,c));
		

	}

}
