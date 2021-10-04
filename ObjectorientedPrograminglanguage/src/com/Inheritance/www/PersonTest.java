package com.Inheritance.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {

	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
    Person p=new Person();
    p.setName("Aman Pandey");
    p.setAddress("125-A Maa Sharda Nagar");
    
    SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
    Date d1=d.parse("20/08/2000");
    
    p.setDob(d1);
    System.out.println("Name : "+p.getName());
    System.out.println("Address : "+p.getAddress());
    System.out.println("Dob : "+p.getDob());
   
	}

}
