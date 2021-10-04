package com.rays.collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) 
	{
		String name;
		int phn_no;
		HashMap h= new HashMap();
		h.put("Bulbul", "9828989700");
		h.put("rupali", "98289899800");
		h.put("kittu", "9828989888");
		h.put("tanu", "9828989999");
		h.put("ansh", "982898988");
		
		String value=(String) h.get("Bulbul");
		System.out.println(value);
		Set keys =h.keySet();
		System.out.println(keys);
		System.out.println("-----------------------");
		Collection c=h.values();
		for (Object object : c) 
		{
			System.out.println(object);	
		}
		System.out.println("-----------------------");
		Set keyvalue=h.entrySet();
		for (Object ele : keyvalue) 
		{
			System.out.println(ele);
		}
			

	}

}
