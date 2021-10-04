package com.CircularLinkedlist.www;

public class CircularLinkedList {
	
	private LinkList last;
	private int length;
	
	private class LinkList{
		private LinkList next;
		private int data;
		
		public LinkList(int data) {
			this.data=data;
		}
	}
	
	public CircularLinkedList() {
		this.last=null;
		length=0;
	}

	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
   
	public void display() {
		 if(last==null) {
			 return;
		 }
		 LinkList first=last.next;
		 while(first!=last) {
			 System.out.print(first.data+"-->");
			 first=first.next;
		 }
		 System.out.print(first.data);
	 }
	
	public void insertFirst(int value) {
		LinkList temp=new LinkList(value);
		if(last==null) {
			last=temp;
		}
		else {
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}
	
	public void createCircularLinkedList() {
		LinkList first=new LinkList(15);
		LinkList second=new LinkList(17);
		LinkList third=new LinkList(35);
		LinkList fourth=new LinkList(99);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
	}
	
	public void insertLast(int value) {
		LinkList temp=new LinkList(value);
		if(last==null) {
			last=temp;
			last.next=last;
		}else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl=new CircularLinkedList();
		cl.insertLast(55);
		cl.insertLast(64);
		
		cl.display();

	}

}
