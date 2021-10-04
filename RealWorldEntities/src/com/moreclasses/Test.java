package com.moreclasses;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args)
	{
		ArrayList l =new ArrayList();
		l.add("one");
		l.add("two");
		l.add(8);
		
		int size = l.size();
	for (int j = 0; j < size; j++)
	{
		
		System.out.println(j +""+ l.get(j));
		Object o = l.get(j);
		System.out.println(j +""+ o);
		
	}
	}
}
		
		
		
		
		
		
		
		
		