package com.jdk8.www;

public interface DefaultStaticTest {
	public void say();
	 public static void show()
	 {
		 System.out.println("rays show");
	 }
	public default void print()
	{
		System.out.println("default method");
		}

}
