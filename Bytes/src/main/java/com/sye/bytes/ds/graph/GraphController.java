package com.sye.bytes.ds.graph;

public class GraphController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		g.printGraph();
		System.out.println();
		String bfs = CheckBFS.bfsTraversal(g, 1);
		System.out.println("bfs "+bfs);
		String dfs = CheckDFS.dfsTraversal(g, 1);
		System.out.println("dfs "+dfs);

	}

}
