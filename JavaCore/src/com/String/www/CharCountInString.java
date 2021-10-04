package com.String.www;

public class CharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Vijay Dinnanath Chouhan";
		int count=0;
		for(int i=0;i<name.length();i++) {
		if('a'==name.charAt(i))	{
			count++;
		}
		}
		System.out.println("Count is "+count);
		
	}

}
