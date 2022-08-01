package com.business.lambdaDemo;

public class LamExample {
	public LamExample()
	{
		System.out.println("Constructor");
	}
public static void demo() {
	System.out.println("Static method **");
}
public void example()
{
	System.out.println("Non-static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fnInterface1 f=()-> {
			System.out.println("Mohan ");
		};
		f.abMethod();
		
f.dfMethod();
fnInterface1.stMehtod();

System.out.println("***** Others");

fnInterface1 g=LamExample::demo;
g.abMethod();


LamExample lam=new LamExample();
fnInterface1 f2=lam::example;
f2.dfMethod();

fnInterface1 f3=LamExample::new;
f3.abMethod();
	}

}
