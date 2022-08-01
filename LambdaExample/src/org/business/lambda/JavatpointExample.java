package org.business.lambda;

public class JavatpointExample {
	public static void main(String args[])
	{
		/*int width=10;  
		Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw(); */
		
		int width=10;  
		Drawable d=()->{
			System.out.println("Drawing1 mohan "+width);
		};
		d.draw();
	}

}


