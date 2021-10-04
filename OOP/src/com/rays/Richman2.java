package com.rays;

public interface Richman2 {
	void donation();
	public void party();
}
class buisnessman implements Richman2
{
	public void donation()
	{
		System.err.println("donation =5000 Rs");
	}
	
	public void party()
	{
		System.err.println(" party will be held on 21 sep");

	}
	public static void main(String[] args) 
		 {
		 	Richman2 b = new buisnessman();
		 	b.donation();
		 	
		 }	 
		
}


