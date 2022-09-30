package com.linkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		
		list.insertFirst(56);
		list.insertLast(70);
		list.printNodeElement();
		
		list.insertInBetween(56,30);
		list.printNodeElement();
	}
}
