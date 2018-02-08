package Graphs;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph=new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B",10 );
		graph.addEdge("A", "D",40 );
		graph.addEdge("B", "C",10 );
		graph.addEdge("C", "D",10 );
		graph.addEdge("D", "E",2 );
		graph.addEdge("E", "F", 3);
		graph.addEdge("E", "G", 2);
		graph.addEdge("F", "G",3 );
		graph.display();
		
	    //graph.removeEdge("A","D");
		//graph.display();
		//System.out.println(graph.numVertices());
		//System.out.println(graph.nEdges());
		//graph.removeVertex("A");
		//graph.display();
        graph.removeEdge("D", "E");
		//System.out.println(graph.isPath("A", "G"));
		//System.out.println(graph.isPathIDPS("A", "G"));
		System.out.println(graph.isConnected());
	}

}
