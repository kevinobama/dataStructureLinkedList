package kevinListedlist;

import kevinListedlist.List;

public class KevinLinkedlist implements List  {
	Node head;

	class Node {		   
		String data;
        Node next;
   
        // Constructor
        Node(String d)
        {
            data = d;
            next = null;
        }
    }
	
	KevinLinkedlist() {
		head = null;
	}	
	
	public boolean add(String item) {
		Node newNode = new Node(item);
		newNode.next = null;
		
        if(head==null) {
        	head=newNode;
        } else {
        	Node last = head;
            while (head.next != null) {
                last = last.next;
            }  
            last.next = newNode;
        }
        				
		return true;
	}
	
	public void remove() {
		
	}
	
	public void getAll() {
		Node currNode = head;
	    
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
    
            // Go to next node
            currNode = currNode.next;
        }
	}
}
