package ds.singlylinkedlist;

// Singly meaning it's one directional -> no returning to previous
public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	// if first is pointing to null means we don't have any other nodes connected
	// to this node
	public boolean isEmpty() {
		return first == null;
	}
	
	// used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data; // the data we pass when we create new node store to newNode's data
		newNode.next = first; // new created node's next should point to old first
		first = newNode; // now we make newNode as first
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next; // we will loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	// delete whatever value on the first node
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	// display the list
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
