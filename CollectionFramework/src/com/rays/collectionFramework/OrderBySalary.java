package com.rays.collectionFramework;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee>
{

	
	@Override
	public int compare(Employee o1, Employee o2) {
		
	  if (o1.getSalary() < o2.getSalary()) return -1;
        if (o2.getSalary() > o1.getSalary()) return 1;
        else return 0;
     
	}
	

}
