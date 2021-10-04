package com.javaBasics.www;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<num-1;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			}
		sc.close();
		

	}

}
