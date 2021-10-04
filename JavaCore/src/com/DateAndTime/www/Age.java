package com.DateAndTime.www;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;




public class Age {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(1992, Month.FEBRUARY, 21);  //Birth date
		 
		Period p = Period.between(birthday, today);
		 
		System.out.println(p.getYears()+" years");
		System.out.println(p.getMonths()+" month");
		System.out.println(p.getDays()+" days");

	}

}
