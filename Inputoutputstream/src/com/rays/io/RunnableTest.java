package com.rays.io;

public class RunnableTest extends DemoThread implements Runnable
{

	public RunnableTest(String name) {
		super(name);
		
	}
	
	public void run()
	{
		System.out.println(name);
	}
	
}
