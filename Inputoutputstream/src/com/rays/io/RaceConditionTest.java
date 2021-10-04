package com.rays.io;

public class RaceConditionTest extends Thread
{
   public static RaceCondition rr =new RaceCondition();
	String name=null;
	public RaceConditionTest (String name)
	{
		this.name=name;
	}
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			rr.deposit(name, 1000);
		}
	}
	public static void main(String[] args) {
		RaceConditionTest r1 = new RaceConditionTest("virat");
		RaceConditionTest r2 = new RaceConditionTest("Dhoni");
		r1.start();
		r2.start();
	}
}
