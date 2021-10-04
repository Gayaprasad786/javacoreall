package com.javaBasics.www;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the num : ");
	       int Num=sc.nextInt();
	       int OriginalNum=Num;
	       int total=0;
	       while(Num!=0) {
	    	   int modu=Num%10;
	    	    total+=(int) Math.pow(modu,3);
	    	   Num=Num/10;
	       }if(OriginalNum==total) {
	       System.out.println("It is a Armstrong Num " );
	       }else {
	    	   System.out.println("Not A Armstrong Num ");
	       }
	     sc.close();


	}

}
