package com.rays.io;

import java.io.Serializable;

public class SerializationDemo implements Serializable
{
	String name;
	String add;
  transient int age;
  
	public SerializationDemo(String name,String add,int age)
	{
		this.name=name;
		this.add=add;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public int getAge() {
		return age;
	}
	
}
