package com.business.lambdaDemo;

public interface fnInterface2 {
public void abMethod();
	
	default void dfMethod()
	{
		System.out.println("Default method fnInterface2 ");
	}
	static void stMehtod()
	{
		System.out.println("Static method fnInterface2");
	}

}
