package com.javaBasics.www;

import java.util.Scanner;

public class NumTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
        sc.close();
	}

}
