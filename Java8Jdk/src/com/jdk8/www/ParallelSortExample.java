package com.jdk8.www;

import java.util.Arrays;

public class ParallelSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,8,7,5,4,7,4,1,6,5};
		for (int i : a)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		Arrays.parallelSort(a);
		for (int i : a) 
		{
			System.out.print(i+" ");
		}

	}

}
