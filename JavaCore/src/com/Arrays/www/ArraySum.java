package com.Arrays.www;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the Numbers : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum =0;
		for(int i=0; i < arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of all Element: " + sum);
        sc.close();

	}

}
