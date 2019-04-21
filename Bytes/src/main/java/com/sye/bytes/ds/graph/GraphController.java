package com.sye.bytes.ds.graph;

import java.util.Arrays;

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
		System.out.println("bfs " + bfs);
		String dfs = CheckDFS.dfsTraversal(g, 1);
		System.out.println("dfs " + dfs);

		// CHECK CYCLE
		Graph cycle = new Graph(4);
		cycle.addEdge(0, 1);
		cycle.addEdge(1, 3);
		cycle.addEdge(1,2);
		cycle.addEdge(2, 0);
		cycle.printGraph();

		System.out.println("Cycle present -> " + CheckCycle.detectCycle(cycle, 0));
		// CHECK CYCLE
		Graph noCycle = new Graph(3);
		noCycle.addEdge(0, 1);
		noCycle.addEdge(1, 2);
		noCycle.addEdge(0, 2);
		//noCycle.addEdge(2, 1);
		noCycle.printGraph();

		System.out.println("Cycle present -> " + CheckCycle.detectCycle(noCycle, 0));
		
		//Mother vertex
		Graph mother = new Graph(4);
		mother.addEdge(3,0);
		mother.addEdge(3,1);
		mother.addEdge(0,1);
		mother.addEdge(1,2);
			
		System.out.println("mother vertex ->"+ CheckMotherVertex.motherVertex(mother));

	}

}
