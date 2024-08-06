package ds.graphenhanced;

public class Vertex {
	String name;
	Node adjList;
	
	Vertex(String name, Node aNode){
		this.name = name;
		this.adjList = aNode;
	}
}
