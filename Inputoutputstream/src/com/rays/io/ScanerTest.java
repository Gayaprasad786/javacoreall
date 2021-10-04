package com.rays.io;

import java.util.Scanner;

public class ScanerTest 
{
	String name;
	int age;
	public ScanerTest(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args)
	{
	 Scanner s =new Scanner(System.in);
	 System.out.println("Enter your name");
	 s.next();
	 System.out.println("Enter your age");
	 s.next();
	 
     
	}
}
