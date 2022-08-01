package com.business.fnExample;
@FunctionalInterface
public interface fnInterface1 {
	
	public void abMethod();
	
public static void staticMethod()
{
	System.out.println("Static method");
}
default void defaultMethod()
{
	System.out.println("Default method");
}

}
