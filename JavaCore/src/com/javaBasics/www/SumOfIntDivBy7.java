package com.javaBasics.www;

public class SumOfIntDivBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%7==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of Int is "+sum);
		

	}

}
