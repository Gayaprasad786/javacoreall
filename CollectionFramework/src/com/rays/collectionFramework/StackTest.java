package com.rays.collectionFramework;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		System.out.println(s);
		s.peek();
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		System.out.println(s);
		Stack s2 = new Stack();
		s.push(s2);
	}
	

}
