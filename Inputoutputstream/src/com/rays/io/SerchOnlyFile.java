package com.rays.io;

import java.io.*;

public class SerchOnlyFile 
{
public static void main(String[] args)
{
	File dir = new File("D:\\java file");
	File []str=dir.listFiles();
	for (int i = 0; i < str.length; i++)
	{
	if(str[i].isFile())
	{
		System.out.println( str[i].getName());
	}
	}
	
}
}
