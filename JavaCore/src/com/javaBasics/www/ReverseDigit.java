package com.javaBasics.www;

import java.util.*;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num : ");
       int a=sc.nextInt();
       int reverseNum=0;
       while(a!=0) {
    	   int modu=a%10;
    	   reverseNum=reverseNum*10+modu;
    	   a=a/10;
       }
       System.out.println("Reverse Num is "+reverseNum);
     sc.close();
       
	}

}
