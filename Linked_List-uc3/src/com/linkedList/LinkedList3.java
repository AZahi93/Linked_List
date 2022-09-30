package com.linkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		
		list.insertFirst(56);
		list.insertLast(30);
		list.insertLast(70);
		
		list.printNodeElement();
	}
}
