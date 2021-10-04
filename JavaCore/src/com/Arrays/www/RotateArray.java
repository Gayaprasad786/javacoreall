package com.Arrays.www;

import java.util.Scanner;

public class RotateArray {
	 void rotate(int[] arr,int d,int size) {
			for(int i=0;i<d;i++) {
				rotateByOne(arr, size);
			}
		}
		
		 void rotateByOne(int[] arr,int size) {
			int temp=arr[0];
			for(int i=0;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[size-1]=temp;
			
		}
		
		 void display(int[] arr,int size) {
			for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();
		System.out.println("Enter the Elements Want to Rotate : ");
		int d=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the Elements of Array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		RotateArray ra=new RotateArray();
		ra.rotate(arr, d, size);
		ra.rotateByOne(arr, size);
		ra.display(arr, size);
		
		sc.close();


	}

}
