package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws Exception
	{
		FileWriter f =new FileWriter("D:\\hello.txt");
		PrintWriter pf = new PrintWriter(f);
		pf.println("hello Rays ");
		pf.println("hello Rays ");
		pf.println("hello Rays ");
		pf.println("hello Rays ");
		f.close();
		pf.close();
		System.out.println("done");
		
	}

}
