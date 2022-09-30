package com.linkedList;

public class SingleLinkedList6 {
Node head;
	
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertLast(int data) {
		Node currentNode = head;
	
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.setData(data);
		currentNode.setNext(node);	
	}
	
	public void insertInBetween(int before,int data) {
		Node currentNode = head;
	
		while(currentNode.data != before) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.next = currentNode.next;
		currentNode.next = node;	
	}
	
	public Node deleteFirst() {
		Node currentNode = head;
		head = head.next;
		return currentNode;
	}
	
	public void deleteLast() {
		Node currentNode = head;
		Node secondLast = null;
		while(currentNode.next != null) {
			secondLast = currentNode;
			currentNode = currentNode.next;
		}
		secondLast.next = null;
	}
	
	public void printNodeElement() {
		Node currentNode = head;
		System.out.println("------Linked List Element------");
		while(currentNode != null) {
			currentNode.display();
			currentNode = currentNode.next;
		}
	}
}
