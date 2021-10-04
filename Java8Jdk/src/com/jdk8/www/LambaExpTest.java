package com.jdk8.www;

public class LambaExpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //(without lambda Expression)
//      AnonymousTest a=new AnonymousTest()
//      {
//		public void say()
//		{
//			System.out.println("hello guys");
//		}
//	};
//	 a.say();
		
	Anonymous a1 = (x,y)->{
		int c=(x+y);
		System.out.println(c);
	};
	a1.add(20,30);

	}

}
