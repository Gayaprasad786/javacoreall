package com.jdk8.wwwcom.jdk9.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ContestentTest {
      String name;
		String phn_no=null;
		public  ContestentTest(String n,String p)
		{
			this.name=n;
			this.phn_no=p;
		}
		public static void main(String[] args) 
		{
		ArrayList<ContestentTest>li = new ArrayList<ContestentTest>();
		   li.add(new ContestentTest("Ram", "9912345678"));
		   li.add(new ContestentTest("Shyam", "9912342222"));
		   li.add(new ContestentTest("Ajay", "9912345770"));
		   li.add(new ContestentTest("Vijay", "9912345678"));
		   li.add(new ContestentTest("Jay", "9912345888"));
		   li.add(new ContestentTest("Pappu", "9912345111"));
		   li.add(new ContestentTest("InvalidNO", "11"));

		   
		   
		   li.stream().map(e-> e.phn_no).filter(e -> e.length() == 10).distinct()
		   .collect(Collectors.collectingAndThen(Collectors.toList(),
			e -> 
		   {
			   Collections.shuffle(e);
			   	return e.stream();
			   
		   })).limit(3).forEach(e ->System.out.println(e));

	}

}
