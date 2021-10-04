package com.Arrays.www;

import java.util.Scanner;

public class ReverseArray {

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
   System.out.println("Array Reverse ");
   for(int i=arr.length-1;i>=0;i--) {
	   System.out.print(arr[i]+" ");
   }
   sc.close();

 }

}
