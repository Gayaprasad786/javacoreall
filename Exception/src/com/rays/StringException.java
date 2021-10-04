package com.rays;

public class StringException 
{
	public static void main(String[] args)
 	{
		try
		{
		String name = "rupali";
		System.out.println("string length" +" " + name.length());
		System.out.println("string length" +" " + name.charAt(7));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("srtring choti he");
		}
		catch(NullPointerException e)
		{
		 {
				System.out.println("sring khali he");
		}
		 

	}

 	}
}