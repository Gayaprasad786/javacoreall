package com.rays.collectionFramework;

import java.util.*;


public class TestCollection
{
public static void main(String[] args) 
	{
		Vector v =new Vector<>();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		v.add("one");
		v.add("two");

		
		System.out.println(v );
		
		Iterator it = v.iterator();
		 while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
			v.retainAll(v);
		}
	}



}
  
			

		
	
	

	
		
		
