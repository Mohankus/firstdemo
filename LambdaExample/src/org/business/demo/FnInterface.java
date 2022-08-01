package org.business.demo;
@FunctionalInterface
public interface FnInterface {
	public void demo1();
	 default void demo2() {
		 System.out.println("Demo2--");
	}
	 static void demo3()
	 {
		 System.out.println("Static demo3--");
	 }
	

}
