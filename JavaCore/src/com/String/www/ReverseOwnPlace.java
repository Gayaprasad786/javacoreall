package com.String.www;

public class ReverseOwnPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Harsh Chouhan";
		String[] str=name.split(" ");
		for(String s:str) {
			for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
		}

	}

}
