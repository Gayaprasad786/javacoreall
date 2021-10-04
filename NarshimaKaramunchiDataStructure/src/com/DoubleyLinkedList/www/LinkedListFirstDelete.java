package com.DoubleyLinkedList.www;

import java.util.NoSuchElementException;

public class LinkedListFirstDelete {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
		}
		
	}
	
	public LinkedListFirstDelete() {
		head=null;
		tail=null;
		length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}
	
	public void displayForward() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	public void displayBackward() {
		if(tail==null) {
			return;
		}
		ListNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.previous;
		}
		System.out.print("null");
	}
	
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(isEmpty()) {
			head=newNode;
		}
		
		else {
			tail.next=newNode;
			newNode.previous=tail;
		}
		tail=newNode;
		length++;
	}
	
	public ListNode deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp=head;
		if(head==tail) {
			tail=null;
		}
		else {
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListFirstDelete df=new LinkedListFirstDelete();
		df.insertLast(18);
		df.insertLast(76);
		df.insertLast(67);
		df.insertLast(84);
		df.insertLast(91);
		df.insertLast(648);
		df.insertLast(7);
		
		df.displayForward();
		System.out.println();
		df.deleteFirst();
		System.out.println();
		df.displayForward();

	}

}
