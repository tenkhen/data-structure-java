package ds.binarysearchtree;

public class BST {

	private Node root;
	
	public void insert(int key, String value) {
		
		Node newNode = new Node(key, value);
		
		if(root == null) {
			root = newNode;
		} else {
			
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if(key < current.key) {
					current = current.leftChild;
					if(current == null) { // it's parent is the leaf node
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node findMin() {
		Node current = root;
		Node last = current;
		
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node findMax() {
		Node current = root;
		Node last = current;
		
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public boolean remove(int key) {
		
		Node current = root;
		Node parent = root;
		
		boolean isLeftChild = false;
		
		// searching to find the node with the key to delete
		while(current.key != key) {
			parent = current;
			if(key < current.key) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				current = current.rightChild;
				isLeftChild = false;
			}
			if(current == null) {
				return false;
			}
		}
		
		// found the node
		Node nodeToDelete = current;
		
		// if node is leaf (a node without a child)
		if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			//
			if(nodeToDelete == root) {
				root = null;
			} else if(isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}
		// if node has one child that is on the left
		else if(nodeToDelete.rightChild == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.leftChild;
			} else if(isLeftChild) {
				parent.leftChild = nodeToDelete.leftChild;
			} else {
				parent.rightChild = nodeToDelete.leftChild;
			}
		}
		// if node has one child that is on the right
		else if(nodeToDelete.leftChild == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.rightChild;
			} else if(isLeftChild) {
				parent.leftChild = nodeToDelete.rightChild;
			} else {
				parent.rightChild = nodeToDelete.rightChild;
			}
		}
		
		// if node has two children (tricky)
		else {
			Node successor = getSuccessor(nodeToDelete);
			
			// connect parent of nodeToDelete to successor instead
			if(nodeToDelete == root) {
				root = successor;
			} else if(isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			
			successor.leftChild = nodeToDelete.leftChild;
		}
		
		return true;
	}
	
	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;
		
		// go to the right child
		Node current = nodeToDelete.rightChild;
		
		// start going left down the tree until node has no left child
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		// if successor not a right child
		if(successor != nodeToDelete.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodeToDelete.rightChild;
		}
		
		return successor;
	}
	
	public void displayTree() {
		
		/** 
		You'll need to implement this method in the following assignment. I've provided 
		the solution at the end of the assignment but please don't just copy the solution. 
		Try to take the time and work on completing this method on your own before viewing
		the solution code. 
		
		This is an interesting and challenging programming problem to help you sharpen 
		your coding skills.
		
		*/
		System.out.println("............................................................");

		System.out.println(root.key);
		
		while(root.leftChild != null) {
			if (root.leftChild == null) {
				System.out.print("--");
			} else {
				System.out.print(root.leftChild.key);
			}
		}
		
		
		
		System.out.print("  ");
		if(root.rightChild == null) {
			System.out.print("--");
		} else {
			System.out.print(root.rightChild.key);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("............................................................");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
