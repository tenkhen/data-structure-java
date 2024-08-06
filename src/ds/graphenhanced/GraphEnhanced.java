package ds.graphenhanced;

public class GraphEnhanced {

	Vertex[] arrayOfLists;
	int indexCounter = 0;
	boolean undirected = true;
	
	public GraphEnhanced(int vCount, String graphType) {
		if(graphType.equals("directed")) {
			undirected = false;
		}
		// initialize arrayOfLists with elements type Vertex
		arrayOfLists = new Vertex[vCount];
	}
	
	// add new vertex with given name to the arrayOfLists (type Vertex)
	public void addVertex(String vertexName) {
		arrayOfLists[indexCounter] = new Vertex(vertexName, null);
		// increment indexCounter to make sure next vertex will be on new index position
		indexCounter++;
	}
	
	public void addEdge(String srcVertexName, String destVertexName) {
		int v1Idx = indexForName(srcVertexName);
		int v2Idx = indexForName(destVertexName);
		// link srcVertex's adjacent to new node (dest) 
		arrayOfLists[v1Idx].adjList = new Node(v2Idx, arrayOfLists[v1Idx].adjList);
	
		if(undirected) {
			// if its undirected, link the dest back to the src
			arrayOfLists[v2Idx].adjList = new Node(v1Idx, arrayOfLists[v2Idx].adjList);
		}
	}
	
	// search a vertex with given name and return it's index position
	int indexForName(String name) {
		for(int v = 0; v < arrayOfLists.length; v++) {
			if(arrayOfLists[v].name.equals(name)) {
				return v;
			}
		}
		return -1;
	}
	
	// print the adjacents
	public void print() {
		System.out.println();
		for(int v = 0; v < arrayOfLists.length; v++) {
			System.out.print(arrayOfLists[v].name);
			for(Node aNode = arrayOfLists[v].adjList; aNode != null; aNode = aNode.next) {
				System.out.print(" --> " + arrayOfLists[aNode.vertexIdx].name);
			}
			System.out.println("\n");
		}
	}
}








































