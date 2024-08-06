package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.insertFirst(12);
		myList.insertLast(45);
		myList.insertLast(76);
		myList.insertLast(25);
		myList.insertLast(87);
		
		myList.displayList();
	}
}
