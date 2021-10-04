package com.rays.io;

public class RaceCondition 
{
	private int bal=0;

	
	public synchronized void deposit( String msg,int amt)
	{
		int bal=getBal();
		 setBal(bal+amt);
		System.out.println( msg +getBal());
	}
	public int getBal() 
	{
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	
}
