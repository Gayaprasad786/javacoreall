package com.rays.io;
import java.io.*;
import java.sql.Date;

public class ReadWritetest
{
 public static void main(String[] args)
 {
	File f =new File("D:\\java file\\hello.txt");
	if(f.exists())
	{
		System.out.println("Name=" +f.getName());
		System.out.println("path =" +""+ f.getAbsolutePath());
		System.out.println("Is writable =" + " "+ f.canWrite());
		System.out.println("Is directory =" +" "+ f.isDirectory());
		System.out.println("last modified at=" +" "+ new Date(f.lastModified()));
		System.out.println("lenth" + f.length());
	}
			
}
}
