
 package org.business.methodreference;

public class MethodRef {

	public static int collect(int z)
	{
		return z*z;
	}
	public int cube(int x)
	{
		return x*x*x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * fnInterface f1=(x)->(x*x); System.out.println(f1.test(5));
		 */
		
		
		
		
		 fnInterface f2=MethodRef::collect; 
		System.out.println(f2.test(5));
		
		MethodRef m=new MethodRef();
		fnInterface fs=m::cube; 
		System.out.println(fs.test(5));
		
		
		
		
	}

}
