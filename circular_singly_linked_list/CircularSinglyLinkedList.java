package com.app.circular_singly_linked_list;

public class CircularSinglyLinkedList {

	ListNode head;
	ListNode tail;//i am using this to keep a track of last node added. for first node heads next will point to tail,
				  //else first tails next will point to new node then new node becomes the tail
	
	public CircularSinglyLinkedList() {
		head = new ListNode();
		head.next = head;
	}
	
	public class ListNode{
		int data;
		ListNode next;
	}
	
	public void addNode(int n) {
		
		ListNode node = new ListNode();
		node.data = n;
		node.next = head;
		
		if(head == head.next) {
			tail = node;
			head.next = node;
			return;
		}
		else {
			tail.next = node;
			tail = node;
		}
		
	}
	
	public void deleteElement(int num) {
		
		ListNode current = head.next;
		ListNode previous = null;
		
		while(current != head && current.data != num) {
			previous = current;
			current = current.next;
		}
		
		System.out.println("Deleted element is " + current.data);
		
		if(current == head && current.next == head) {
			head = null;
			return;
		}
		
		if(current == head) {
			previous = head;
			while (previous.next != head) {
				previous = previous.next;
			}
			
            head = previous.next;
            previous.next = head;
			return;
		}
		
		if(current.next == head) {
			previous.next = head;
			return;
		}
		
		previous.next = current.next;
	}
	
	public void printList() {
		
		ListNode currentNode = head.next;
		
		while(currentNode != head) {
			
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
	
		}
	}
	
	
}
