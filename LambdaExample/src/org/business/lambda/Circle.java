package org.business.lambda;

public interface Circle {
	public void draw();
	default void c1()
	{
		System.out.println(" default method in Drawable Interface M1 ");
	}
	static void c2()
	{
		System.out.println(" Static method in Drawable Interface M2");
	}
}
