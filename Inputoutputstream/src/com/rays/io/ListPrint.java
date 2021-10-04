package com.rays.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ListPrint 
{
public static void main(String[] args) throws Exception 
{
	FileReader f =new FileReader("D:\\java file\\hello.txt");
	int ch= f.read();
	char c;
	while(ch!=-1)
	{
		c=(char)ch;
		System.out.print(c);
		ch=f.read();
	}
}
}
