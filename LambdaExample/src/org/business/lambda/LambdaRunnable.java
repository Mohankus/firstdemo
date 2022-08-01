package org.business.lambda;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runnable r1=new Runnable() {
			
			public void run()
			{
				System.out.println("Runnable R1");
			}
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		
		Runnable r2=()->{
			System.out.println("Runnable r2");
						
		};
		Thread t2=new Thread(r2);
		t2.start();
		
		
	}

}
