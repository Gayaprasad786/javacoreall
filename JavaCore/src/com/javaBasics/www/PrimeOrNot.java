package com.javaBasics.www;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int temp=0;
		for (int i = 2; i<= num ; i++)
		{
			if(num%i == 0)
			{
				temp+=1;
			}
		}
		if(temp==1) {
			System.out.print("This Number is Prime");
		}else {
			System.out.println("This Number is not Prime");
		}
    sc.close();
	}

}
