package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Employee implements Comparable<Employee>
{
    String name;
    int salary;

 Employee(String name,int salary)
    {
    	this.name=name;
    	this.salary=salary;
   }
 
 public String getName() {
	return name;
}

public int getSalary() {
	return salary;
}

public static void main(String[] args)
	{
		Employee m1= new Employee("rupali",10000);
		 Employee m2=new Employee("bulbul",50000);
		 Employee m3=new Employee("kittu",8000);
		 ArrayList a =new ArrayList();
		 a.add(m1);
		 a.add(m2);
		 a.add(m3);
		 System.err.println("order by name");
		 Collections.sort(a);
		 Iterator it = a.iterator();
		 while (it.hasNext()) {
			Employee ob = (Employee) it.next();
	          System.out.println(ob.name + " "+ob.salary);
	          }
		 System.out.println("------------------");
		 
		 System.err.println("order by salary");
		 
		 OrderBySalary os =new OrderBySalary();
		 Collections.sort(a,os);
		 Iterator it2 = a.iterator();
		 while (it2.hasNext()) {
			Employee ob = (Employee) it2.next();
			
	          System.out.println(ob.name + " "+ob.salary);
	          }
	}
    public int compareTo(Employee o)
    {
     return this.name.compareTo(o.name);
    }
	}









	

