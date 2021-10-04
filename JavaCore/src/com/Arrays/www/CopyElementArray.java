package com.Arrays.www;

import java.util.Scanner;

public class CopyElementArray {

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
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
        int[] arr1=new int[arr.length];
		for(int j=0;j<arr.length;j++) {
			arr1[j]=arr[j];
		}
		System.out.println("The Copy Array Values Are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		sc.close();


	}

}
