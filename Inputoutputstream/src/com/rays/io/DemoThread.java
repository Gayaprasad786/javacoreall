package com.rays.io;

import java.io.FileReader;

public class DemoThread extends Thread
{
  String name;

  public DemoThread(String name)
  {
	  this.name=name;
  }
  public void run()
  {
	  System.out.println(name);
	 
	 
  }
  }
