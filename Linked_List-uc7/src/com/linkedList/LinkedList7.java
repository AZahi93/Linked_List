package com.linkedList;

public class LinkedList7 {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

		list.insertFirst(56);
		list.insertLast(70);
		list.insertInBetween(56, 30);
		list.printNodeElement();
		list.findNode(30);
	}
}
