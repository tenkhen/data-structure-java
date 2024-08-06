package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(84);
		list.insertFirst(35);
		list.insertFirst(27);
		list.insertLast(78);
		list.insertFirst(10);
		list.insertAfter(84, 55);
		list.insertBefore(84, 20);
		list.insertBefore(20, 1000);
		list.deleteFirst();
		list.deleteLast();
		list.deleteKey(1000);
		
		list.displayForward();
		list.displayBackward();
	}
}
