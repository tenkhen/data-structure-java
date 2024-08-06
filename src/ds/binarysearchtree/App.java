package ds.binarysearchtree;

public class App {

	public static void main(String[] args) {
		
		BST tree = new BST();
		
		tree.insert(10, "ten");
		tree.insert(15, "fifteen");
		tree.insert(50, "fifty");
		tree.insert(20, "twenty");
		
//		System.out.println(tree.findMin().key);
//		System.out.println(tree.findMax().key);
//		
//		System.out.println(tree.remove(10)); // print true if deleted
//		System.out.println(tree.findMin().key);
		
		tree.displayTree();
	}
}
