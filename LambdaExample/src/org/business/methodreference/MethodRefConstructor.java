package org.business.methodreference;

public class MethodRefConstructor {

	MethodRefConstructor(String str)
	{
		System.out.println("Constructor Method ref"+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fnConstructor f1=(m)-> new MethodRefConstructor(m);
		f1.RefConstrctor("demo22");
		
		fnConstructor f2=MethodRefConstructor :: new;
		f2.RefConstrctor("demo 33");
		
	}

}
