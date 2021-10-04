package com.jdk8.www;

public class StaticDefaultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DefaultStaticTest s1  = new DefaultStaticTest()
       {
			public void say()
			{
			System.out.println("functional");
			}
		};	

    s1.say();
	s1.print();
	DefaultStaticTest.show();
	}

	

	}


