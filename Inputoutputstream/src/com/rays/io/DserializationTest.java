package com.rays.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DserializationTest {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fi= new FileInputStream("D:/obect.ser");
		ObjectInputStream oi= new ObjectInputStream(fi);
		SerializationDemo sd1= (SerializationDemo)oi.readObject();
		System.out.println("name =" + sd1.getName());
		System.out.println("add =" + sd1.getAdd());
		System.out.println("age =" + sd1.getAge());
		

	}
	

}
