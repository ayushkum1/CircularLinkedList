package com.app.circular_doubly_linked_list;

import java.util.Scanner;

public class CircularDoublyTester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
			int data;
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Choose an option to continue :");
				System.out.println("1.Add an element by sorting"
									+"\n2.Remove the very first appearance of an element"
									+"\n3.Remove all the apperacnces of an element"	
									+"\n4.Print the List"
									+"\n5.Exit");
				
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						System.out.println("Please enter the value of an element to be added:");
						data=sc.nextInt();
						circularDoublyLinkedList.addElement(data);
						break;
						
					case 2:
						System.out.println("Enter the value in order to remove it once:");
						data=sc.nextInt();
						circularDoublyLinkedList.deleteElement(data);
						break;
						
					case 3:
						System.out.println("Enter the value in order to remove it completely from the list:");
						data=sc.nextInt();
						circularDoublyLinkedList.deleteAllOccurance(data);
						break;
						
					case 4:
						circularDoublyLinkedList.printList();
						break;
						
					case 5:
						System.out.println("Bye!!");
						System.exit(0);
						exit = true;
						break;
						
					default:
						System.out.println("Please select valid opion!");
						break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
