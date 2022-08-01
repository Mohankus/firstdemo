package org.business.lambda;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fnIntro f=(a,b)->{
			return "I am"+(a+b);
		};
System.out.println(f.sayName(5,3));
	}

}

@FunctionalInterface
interface fnIntro
{
	public String sayName(int a, int b);
}
