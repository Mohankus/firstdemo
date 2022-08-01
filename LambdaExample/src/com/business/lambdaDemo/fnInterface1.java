package com.business.lambdaDemo;

public interface fnInterface1 extends fnInterface2{
	public void abMethod();
	
	default void dfMethod()
	{
		System.out.println("Default method fnInterface1 ");
	}
	static void stMehtod()
	{
		System.out.println("Static method fnInterface1");
	}

}
