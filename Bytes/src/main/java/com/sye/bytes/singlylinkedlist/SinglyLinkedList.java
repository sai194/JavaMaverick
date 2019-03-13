package com.sye.bytes.singlylinkedlist;

public class SinglyLinkedList {

	private Node first;	
	
	public void displayList(){
		Node currentNode =first;
		while(currentNode!=null) {
			System.out.print(currentNode.val+" ");
			currentNode =currentNode.next;
		}
		
	}
	public void insertFirst(int val) {
		Node newNode =new Node(val); 
		
		if(first==null) {
			first = newNode;
		}else {
			newNode.next= first;
			first=newNode;
		}
		
		
	}
	
	public Node deleteFirst() {
		
		Node delNode = first;
		if(first!=null) {
			first =first.next;	
		}
		return delNode;
		
		
	}
	
	public void insertLast(int val) {
		
		Node newNode = new Node(val);
		
		Node currentNode = first;
		
		while(currentNode.next!=null) {			
			currentNode =currentNode.next;
		}
		
		currentNode.next =newNode;
		
		
	}
	
	
}
