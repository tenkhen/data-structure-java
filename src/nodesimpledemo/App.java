package nodesimpledemo;

public class App {

	public static void main(String[] args) {
		// initializing Node
		Node nodeA = new Node();
		Node nodeB = new Node();
		Node nodeC = new Node();
		Node nodeD = new Node();
		Node nodeE = new Node();
		Node nodeF = new Node();
		
		// assigning values
		nodeA.data = 23;
		nodeB.data = 45;
		nodeC.data = 73;
		nodeD.data = 23;
		nodeE.data = 89;
		nodeF.data = 37;
		
		// linking nodes
		nodeA.next = nodeB; // nodeA.next --> nodeB
		nodeB.next = nodeC; // nodeB.next --> nodeC
		nodeC.next = nodeD; // nodeC.next --> nodeD
		nodeD.next = nodeE; // nodeD.next --> nodeE
		nodeE.next = nodeF; // nodeE.next --> nodeF
		// nodeF.next --> null
		
		// get length of linked nodes
		int length = listLength(nodeA);
		System.out.println(length);
	}
	
	public static int listLength(Node aNode) {
		int length = 0;
		Node currentNode = aNode; // set node we passed as currentNode

		while(currentNode != null) { // check if currentNode is null
			length++;
			currentNode = currentNode.next; // change current node to next node (nodeA -> nodeB)
		}
		return length;
	}
}
