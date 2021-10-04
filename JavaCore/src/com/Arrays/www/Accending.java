package com.Arrays.www;

import java.util.Scanner;

public class Accending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the Numbers : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the origional array is");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("Accending Order Of Array is " );
		for(int i = 0; i <arr.length; i++) 
		{	
			for(int j =i+1; j <arr.length; j++) 
			{
				if(arr[i]>arr[j])	
					{
						temp=arr[i];
						arr[i] = arr[j];
						arr[j]=	temp;	
					}
			
			}
			System.out.print(arr [i]+" ");
		}
				
     sc.close();
	}

}
