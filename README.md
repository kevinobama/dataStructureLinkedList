Implementing a Linked List in Java using Class

Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at the contiguous location, the elements are linked using pointers as shown below. 

linkedlist

In Java, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type. 

class LinkedList {
    Node head; // head of list
 
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
 
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }
}
 

Creation and Insertion

In this article, insertion in the list is done at the end, that is the new node is added after the last node of the given Linked List. For example, if the given Linked List is 5->10->15->20->25 and 30 is to be inserted, then the Linked List becomes 5->10->15->20->25->30. 
Since a Linked List is typically represented by the head pointer of it, it is required to traverse the list till the last node and then change the next to last node to the new node.

linkedlist_insert_last


import java.io.*;
   
// Java program to implement
// a Singly Linked List
public class LinkedList {
   
    Node head; // head of list
   
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
   
        int data;
        Node next;
   
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
   
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
   
            // Insert the new_node at last node
            last.next = new_node;
        }
   
        // Return the list by head
        return list;
    }
   
    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
    
            // Go to next node
            currNode = currNode.next;
        }
    }
    
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
   
        //
        // ******INSERTION******
        //
   
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
   
        // Print the LinkedList
        printList(list);
    }
}
Output
LinkedList: 1 2 3 4 5 6 7 8 
Traversal

For traversal, below is a general-purpose function printList() that prints any given list by traversing the list from head node to the last.