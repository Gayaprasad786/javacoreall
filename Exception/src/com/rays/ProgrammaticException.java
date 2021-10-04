package com.rays;

public class ProgrammaticException extends RuntimeException
{
	public static boolean isValidUser()
	{
		return true;
	}
	public static void main(String[] args)
	{
	
	 boolean userfound = isValidUser();
	 if(userfound)
	 {
	System.out.println("valid user");
	 }
	 else 
	 {
		 RuntimeException e = new RuntimeException("invaild user");
		 throw e;
	 }
	 
	}
}
