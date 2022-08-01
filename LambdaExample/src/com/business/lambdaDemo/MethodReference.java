package com.business.lambdaDemo;

public class MethodReference {
	public static int square(int x)
	{
		return x*x;
	}
public int cube(int x)
{
	return x*x*x;
}
//MethodReference(String s)
//{
//	System.out.println("Message--"+s);
//}
	public static void main(String[] args) {
	
		FnMethodRef f=(x)->x*x;
		System.out.println(f.operation(5));
		
		FnMethodRef f1=MethodReference::square;
		System.out.println(f1.operation(5));
		
		MethodReference m=new MethodReference();
		FnMethodRef f2=m::cube;
		System.out.println(f2.operation(5));
	}
	
}

 