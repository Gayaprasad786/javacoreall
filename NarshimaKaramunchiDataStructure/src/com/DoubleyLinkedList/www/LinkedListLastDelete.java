package com.DoubleyLinkedList.www;

import java.util.NoSuchElementException;

public class LinkedListLastDelete {

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
	
	public LinkedListLastDelete() {
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
	
	public ListNode deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp=tail;
		if(head==tail) {
			tail=null;
		}else {
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		return temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedListLastDelete ld=new LinkedListLastDelete();
      ld.insertLast(15);
      ld.insertLast(66);
      ld.insertLast(78);
      ld.insertLast(55);
      ld.insertLast(668);
      ld.insertLast(97);
      
      ld.displayForward();
      ld.deleteLast();
      System.out.println();
      ld.displayForward();
	}

}
