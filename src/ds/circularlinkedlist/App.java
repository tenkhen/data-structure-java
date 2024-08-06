package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		
		CircularLinkedList myList = new CircularLinkedList();
		
		myList.insertFirst(12);
		myList.insertLast(45);
		myList.insertLast(87);
		myList.insertFirst(100);
		myList.deleteFirst();
		
		myList.displayList();
	}
}
