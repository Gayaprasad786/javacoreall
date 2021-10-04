package com.rays.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashTreeLinked
{
   
	public static void main(String[] args)
	{
	  HashSet s =new HashSet();
	  s.add(10);
	  s.add(30);
	  s.add(89);
	  s.add(92);
	  s.add(39);
	  System.out.println("print by Hashset randomly");
	  Iterator it= s.iterator();
	  while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
	  } 
	  System.out.println("________________");
	  
	  TreeSet <String> t =new TreeSet();
	  t.add("java");
	  t.add("collection");
	  t.add("exception");
	  t.add("String");
	  t.add("array");
	  System.out.println("print by Treeset randomly ");
	  Iterator it2= t.iterator();
	  while (it2.hasNext()) {
		Object object1 = (Object) it2.next();
		System.out.println(object1);
	  } 
	  System.out.println("________________");

	  LinkedHashSet l =new LinkedHashSet<>();
	  l.add("java");
	  l.add("collection");
	  l.add("exception");
	  l.add("String");
	  l.add("array");
	  System.out.println("print by LinkedHashSet insertion ");
	  Iterator it3= l.iterator();
	  while (it3.hasNext()) {
		Object object1 = (Object) it3.next();
		System.out.println(object1);
	  } 
	  System.out.println("________________");

}
	

	

}
