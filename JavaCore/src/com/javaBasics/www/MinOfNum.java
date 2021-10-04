package com.javaBasics.www;

import java.util.Scanner;

public class MinOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Two Numbers : ");
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      if(a<b) {
	    	  System.out.println("A is Minimum");
	      }else {
	    	  System.out.println("B is Minimum");
	      }
	      sc.close();
	}

}
