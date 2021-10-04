

package com.rays.io;

import java.io.*;
public class SerializationTest {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream f= new FileOutputStream ("D:/obect.ser");
		ObjectOutputStream ob =new ObjectOutputStream(f);
		SerializationDemo sd= new SerializationDemo("bulbul","chauhan", 23);
		
		ob.writeObject(sd);
		ob.close();
		System.out.println("done");
		
			}

}
