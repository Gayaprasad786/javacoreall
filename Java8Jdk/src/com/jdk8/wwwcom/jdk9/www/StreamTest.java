package com.jdk8.wwwcom.jdk9.www;

import java.util.ArrayList;


public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		
//		Stream<String>  s= a.stream();

		a.stream().forEach(e->{System.out.println(e);});

	}

}
