package com.javaBasics.www;

import java.util.Scanner;

public class SecondMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int num=sc.nextInt();
		int[] arr=new int[num]; 
		System.out.println("Enter the number :");
        for(int i=0;i<num;i++) {
             arr[i]=sc.nextInt();
        }
        int max=arr[0],secondLargest=0;
        for(int i=0;i<num;i++) {
        	if(arr[i]>max) {
        		secondLargest=max;
        		max=arr[i];
        	}
        }
        System.out.println("Second Largest Max in Array is "+secondLargest);
        sc.close();
	}

}
