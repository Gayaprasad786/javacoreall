package com.rays.io;

public class Testthread {

	public static void main(String[] args)
	{
		DemoThread d =new DemoThread("kittu");
		DemoThread d1 = new DemoThread("tanu");
		
		d.start();
		d1.start();
 
		RunnableTest r1 =new RunnableTest("bulbul");
		RunnableTest r2 =new RunnableTest("dimple");
		  
		Thread th =new Thread(r1);
		Thread th1 =new Thread(r2);
		th.start();
		th1.start();
		
		
			
			
	}

}
