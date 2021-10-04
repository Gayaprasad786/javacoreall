package com.rays.io;

import java.io.FileNotFoundException;
import java.io.*;

public class CopyText {

	public static void main(String[] args) throws Exception
	{
		String Source="D:\\java file\\helloc.txt";
		String target="D:\\java file\\javac.txt";
		
		FileReader f = new FileReader(Source);
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
