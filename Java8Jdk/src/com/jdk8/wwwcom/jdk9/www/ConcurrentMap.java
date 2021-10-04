package com.jdk8.wwwcom.jdk9.www;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;



public class ConcurrentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<String> ab=new  ArrayBlockingQueue<String>(4);
		ab.add("Aman");
		ab.add("Ujjwal");
		
		Iterator<String> it= ab.iterator();
		ab.add("Dev");
		while (it.hasNext()) {
			Object object =it.next();
			System.out.println(object);

	}
		

}

}