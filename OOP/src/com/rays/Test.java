package com.rays;


	public interface Richman
	{
	public void donation();
	 void party();
	 }
	class BuisnessMan implements Richman 
	{
		public void donation()
		{
			System.out.println("donation =1000 Rs");
		}
		
		public void party()
		{
			System.out.println(" party will be held on 25 sep");

		}
	}
	public class Test {

	public static void main(String[] args) 
	{
		Richman r = new BuisnessMan();
	     r.donation();
	     r.party();
	 }	
	}


