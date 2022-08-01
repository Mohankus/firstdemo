package org.business.lambda;

public class DefultStaticExample  implements Drawable,Circle{
public static void main(String args[])
{

	DefultStaticExample df=new DefultStaticExample();
	df.m1();
	
}

@Override
public void draw() {
	// TODO Auto-generated method stub
	
}


public  void m1()
{
	System.out.println("  As default method in Drawable Interface M1 ");
}



}