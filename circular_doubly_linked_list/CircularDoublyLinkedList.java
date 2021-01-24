package com.app.circular_doubly_linked_list;

public class CircularDoublyLinkedList {

	ListNode head;

	public CircularDoublyLinkedList() {
		head = new ListNode();
		head.next = head;
		head.previous = head;
	}

	public class ListNode {
		int data;
		ListNode next;
		ListNode previous;
	}

	public void addElement(int num) {

		ListNode node = new ListNode();
		node.data = num;
		node.next = null;
		node.previous = null;

		ListNode current = head.next;

		while (current != head && current.data < node.data) {
			current = current.next;
		}

		node.next = current;
		node.previous = current.previous;
		current.previous.next = node;
		current.previous = node;

	}

	
	public void deleteAllOccurance(int num) {
		ListNode current = head.next;
		while(current != head) {
			if(current.data == num) 
				deleteNode(current);
			current = current.next;
		}
	}
	
	public void deleteElement(int num) {
		ListNode current = head.next;
		while(current != head) {
			current = current.next;
		}
		deleteNode(current);
	}
	
	public void deleteNode(ListNode node) {
		System.out.println("Deleted element is " + node.data);
		node.previous.next = node.next;
		node.next.previous = node.previous;
	}
	
	public void printList() {

		ListNode current = head.next;

		while (current != head) {
			System.out.println(current.data);
			current = current.next;
		}

	}

}
