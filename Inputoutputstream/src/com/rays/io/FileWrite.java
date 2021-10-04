package com.rays.io;

import java.io.*;

public class FileWrite 
{
public static void main(String[] args) throws Exception 
{
 FileWriter f =new FileWriter("D:\\java file\\hello.txt",true);
  PrintWriter p = new PrintWriter(f);
    
  p.println("hello Admin");
  p.println("hello Admin");
  p.println("hello Admin");
  p.println("hello Admin");
  p.println("hello Admin");
   
  f.close();
  p.close();
  System.out.println("done");
	
}
}
