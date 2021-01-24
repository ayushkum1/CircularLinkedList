package com.app.circular_singly_linked_list;

public class CircularSinglyTester {

	public static void main(String[] args) {
		
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
	
		circularSinglyLinkedList.addNode(10);
		circularSinglyLinkedList.addNode(5);
		circularSinglyLinkedList.addNode(100);
		circularSinglyLinkedList.addNode(1000);
		circularSinglyLinkedList.addNode(10000);
		circularSinglyLinkedList.printList();
		circularSinglyLinkedList.deleteElement(1000);
		circularSinglyLinkedList.printList();
		
	}

}
