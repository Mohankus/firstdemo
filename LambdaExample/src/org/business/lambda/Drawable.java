package org.business.lambda;

public interface Drawable {

	public void draw();
	default void d1()
	{
		System.out.println(" default method in Drawable Interface M1 ");
	}
	static void d2()
	{
		System.out.println(" Static method in Drawable Interface M2");
	}
}
