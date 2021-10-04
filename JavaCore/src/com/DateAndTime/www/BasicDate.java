package com.DateAndTime.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d =new Date();
		SimpleDateFormat dd= new SimpleDateFormat("dd/mm/yyyy");
		String mm= dd.format(d);
		System.out.println("Date:" + mm);
		
		
		
		String yy = "21/02/1992";
		Date aa=dd.parse(yy);
		System.out.println("Date:" + aa);
	}

}
