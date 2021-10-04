package com.Arrays.www;

public class Rotate {
	
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
		Rotate r=new Rotate();
		int[] arr= {1,2,3,4,5,6,7};
		r.rotate(arr,2,7);
		r.display(arr,7);
		

	}

}
