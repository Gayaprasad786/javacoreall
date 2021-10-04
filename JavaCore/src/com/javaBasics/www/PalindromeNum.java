package com.javaBasics.www;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int originalNum=num;
		int reverseNum=0;
		while(num!=0) {
			  int modu=num%10;
	    	   reverseNum=reverseNum*10+modu;
	    	   num=num/10;
		}
		if(originalNum==reverseNum) {
			System.out.println("This is a Palindrome Number");
		}else {
			System.out.println("This is not a Palindrome Number");
		}
     sc.close();
	}

}
