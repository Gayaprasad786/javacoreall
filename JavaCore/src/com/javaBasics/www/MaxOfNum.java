package com.javaBasics.www;

import java.util.*;

public class MaxOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Two Numbers : ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b) {
    	  System.out.println("A is Maximum");
      }else {
    	  System.out.println("B is Maximum");
      }
      sc.close();
	}

}
