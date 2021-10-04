package com.javaBasics.www;

import java.util.Scanner;

public class HarmonicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		float harmonic=1;
		for(int i=2;i<=num;i++) {
			harmonic+=(float)1/i;
		}
		System.out.println("The harmonic num "+num+" "+harmonic);
        sc.close();
	}

}
