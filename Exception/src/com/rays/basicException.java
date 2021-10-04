package com.rays;

public class basicException
{
public static void main(String[] args)
{
int arr[] = new int[] {2,44,31,9,1};
{
	try
	{
	 int i=15;
	 int j=3;
	 double d = i/j ;
	 System.out.println("div =" + d);
		System.out.println(arr[5]);
	}
	catch (Exception e)
	{
		System.out.println("not  divide by zero");
	}

}
}
}