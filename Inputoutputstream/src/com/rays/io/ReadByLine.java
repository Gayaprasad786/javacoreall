package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadByLine {

	public static void main(String[] args) throws Exception 
	{
		FileReader fr =  new  FileReader("D:\\java file\\javac.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line =bf.readLine();
		while(line!=null)
		{
		System.out.println(line);	
		line=bf.readLine();
		}
	  fr.close();

	}

}
