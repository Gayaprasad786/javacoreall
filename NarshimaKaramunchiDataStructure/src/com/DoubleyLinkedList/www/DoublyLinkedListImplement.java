package com.DoubleyLinkedList.www;

public class DoublyLinkedListImplement {
	
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
	
	public DoublyLinkedListImplement() {
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
			newNode.previous=tail;
		}
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListImplement dl=new DoublyLinkedListImplement();
		dl.insertLast(1);
		dl.insertLast(7);
		dl.insertLast(80);
		dl.insertLast(846);
		dl.insertLast(86);
		dl.insertLast(54);
		dl.insertLast(46);
		
		dl.displayForward();
		System.out.println("\n");
		dl.displayBackward();

	}

}
