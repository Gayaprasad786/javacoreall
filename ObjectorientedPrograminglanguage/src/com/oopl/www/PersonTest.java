package com.oopl.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class PersonTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Person ac=new Person();
		ac.setName("Aman");
		ac.setAddress("C-520 Sukhliya Indore");
        
	    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yy");
		String str="15/07/1970";
		Date date =format1.parse(str);
		ac.setDateOfBirth(date);
		
		System.out.println("The Name of Person : "+ac.getName());
		System.out.println("The Address of Person : "+ac.getAddress());
		System.out.println("The DOB of Person : "+ac.getDateOfBirth());
	}

}
