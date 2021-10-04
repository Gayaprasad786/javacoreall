package com.DoubleyLinkedList.www;



public class DoublyLinkedInsertFirst {
	
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
	
	public DoublyLinkedInsertFirst() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}
	
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(isEmpty()) {
			head=newNode;
		}else {
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
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
	
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		if(isEmpty()) {
			tail=newNode;
		}else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}


	   public static void main(String[] args) {
		
		DoublyLinkedInsertFirst in=new DoublyLinkedInsertFirst();
		in.insertFirst(12);
		in.insertFirst(15);
		in.insertFirst(16);
		in.insertFirst(25);
		
		in.displayForward();
		System.out.println("\n");
		in.displayBackward();

	}

}
