package com.javaBasics.www;

import java.util.Scanner;

public class NoddAndevenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int totalEven=0,totalOdd=0;
		for(int i=0;i<=num;i++) {
		if(i%2==0) {
			totalOdd+=i;
		}else {
			totalEven+=i;
		}
		}
		System.out.println("Sum of Even Number in N Natural Number "+totalEven);
		System.out.println("Sum of Odd Number in N Natural Number "+totalOdd);
   sc.close();
	}

}
