package com.rays.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CorrectDataprint {

	public static void main(String[] args) throws Exception
	{
		String source="c:\\email.txt";
		String target="c:\\correctemail.txt";
		FileReader f=new FileReader(source);
		FileWriter fw =new FileWriter(target);
		
	    int ch=f.read();
	    while(ch!=-1)
		{
			
			fw.write(ch);
			ch=f.read();
			
		}
		f.close();
		fw.close();
		System.out.println("done");
	}

}

