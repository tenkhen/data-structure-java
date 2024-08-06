package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; // if empty, last will refer to the new Node being created
		} else {
			first.previous = newNode; // else whatever first Node is, it's previous set to newNode
		}
		
		// the new node's next field will point to the old first (if there is node then this will be the
		// node, otherwise this will be null as initial)
		newNode.next = first;
		this.first = newNode; // now we have new first
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // assigning old last to new node
			newNode.previous = last; // the old last will be the newnode's previous
		}
		last = newNode; // the linkedlist's last field should point to the new node
	}
	
	// assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		
		if(first.next == null) { // there is only one item in the list
			last = null;
		} else {
			first.next.previous = null; // the list's first node will point to null
		}
		// we are assigning the reference of the node following the old first node to
		// the first field in the linked list object 
		first = first.next;
		return temp; // return the deleted old first node
	}
	
	// assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		
		if(first.next == null) { // we have only one node in this list
			first = null;
		} else {
			// the last node (going to be deleted) it's previous node's next node will be 
			// the last node itself and set it to null. So previous node is pointing to
			// null. And we lost reference of last node (which is deleted)
			last.previous.next = null; 
		}
		
		last = last.previous; // we are setting new last which is previous of deleted node
		return temp;
	}
	
	// assume non-empty list
	public boolean insertAfter(int key, int data) { 
		Node current = first; // we start from the beginning of the list
		// as long as we have not found the key in a particular node
		while(current.data != key) {
			current = current.next;
			
			// we reached at the end and couldn't find the data we were searching for
			if(current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		} else {
			// new node's next field should point to the node ahead of the current one
			newNode.next = current.next;
			// the node ahead of current, it's previous field should point to the new node
			current.next.previous = newNode;  
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	public boolean insertBefore(int key, int data) {
		Node current = first;
		
		while(current.data != key) {
			current = current.next;
			if(current.next == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == first) {
			newNode.previous = null;
			first = newNode;
		} else {
			newNode.previous = current.previous;
			current.previous.next = newNode;			
		}
		
		newNode.next = current;
		current.previous = newNode;
		
		return true;
	}
	
	// assume non-empty list
	public Node deleteKey(int key) {
		Node current = first; // start from the beginning
		while(current.data != key) {
			current = current.next;
			if(current == null) { 
				return null;
			}
		}
		
		if(current == first) {
			// make the first field point to the node following current since current will be deleted
			first = current.next; 
		} else {
			// replace current's previous next to current's next. Unlink current from between
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		} else {
			// replace current's next's previous with current's previous. Unlink current from between
			current.next.previous = current.previous;		
		}

		return current;
	}
	
	public void displayBackward() {
		System.out.print("List (last --> first): ");
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
	
	public void displayForward() {
		System.out.print("List (first --> last): ");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
