package com.business.fnExample;

public class Demo implements fnInterface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		fnInterface1 f1=()->{
			System.out.println("Fninterface1 **");
		};
		f1.abMethod();
		f1.defaultMethod();
		fnInterface1.staticMethod();
		System.out.println();
		System.out.println("Using implementation \n");
		Demo d=new Demo();
		d.abMethod();
		d.defaultMethod();
		fnInterface1.staticMethod();
		

	}

	@Override
	public void abMethod() {
		// TODO Auto-generated method stub
		System.out.println("FnInterface1 implements using**");
	}

}
