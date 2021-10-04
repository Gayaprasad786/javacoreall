package com.Arrays.www;

import java.util.Scanner;

public class MinValueInArray {

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
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The Minimum Value In Array "+min);
		sc.close();


	}

}
