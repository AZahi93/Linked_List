package com.linkedList;

public class Node6 {

	int data;
	Node next;
	
	public Node6(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void display() {
		System.out.println(" "+data);
	}
}