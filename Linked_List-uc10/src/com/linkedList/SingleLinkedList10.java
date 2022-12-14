package com.linkedList;

public class SingleLinkedList10 {
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
	
	public void deleteAnyNode(int data) {
		Node currentNode = head;
		Node previousNode = head;
		
		while(currentNode != null) {
			if(currentNode.data == data) {
				previousNode.next = currentNode.next;
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
	}
	
	public Node findNode(int data) {
		Node currentNode = head;
		
		while(currentNode.next != null) {
			if(currentNode.data == data) {
				System.out.println("Element Found "+data);
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		return null;
	}
	
	public void sort() {
		Node currentNode = head , index = null;
		if(head == null) {
			System.out.println("List Is Empty");
			return;
		}
		
		while(currentNode != null) {
			index = currentNode.getNext();
			while(index != null) {
				if(currentNode.getData() > index.getData()) {
					int temp = currentNode.getData();
					currentNode.setData(index.getData());
					index.setData(temp);
				}
				index = index.getNext(); 
			}
			currentNode = currentNode.getNext();
		}
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
