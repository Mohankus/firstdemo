package org.business.demo;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LambdaDemo l=new LambdaDemo();
		FnInterface f=()->{
			System.out.println(" now-1 Fn Interface");
		};
		f.demo1();
		f.demo2();
		FnInterface.demo3(); 
		
	}

	

}
