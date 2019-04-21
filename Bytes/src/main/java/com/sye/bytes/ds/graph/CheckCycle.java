package com.sye.bytes.ds.graph;

public class CheckCycle {

	public static boolean detectCycle(Graph g, int source) {

		boolean[] visited = new boolean[g.vertices];
		boolean[] recNodes = new boolean[g.vertices];

		for (int i = 0; i < g.vertices; i++) {
			if (detectCycleRec(g, i, visited, recNodes))
				return true;

		}

		return false;
	}

	public static boolean detectCycleRec(Graph g, int vertex, boolean[] visited, boolean[] recNodes) {
		//System.out.println("in rec");
		if (recNodes[vertex])
			return true;

		if (visited[vertex])
			return false;

		visited[vertex] = true;
		recNodes[vertex] = true;

		if (g.array[vertex].size()>0 && g.array[vertex].getFirst() != null) {
			Integer node = (Integer) g.array[vertex].getFirst();
			if (detectCycleRec(g, node, visited, recNodes)) {
				return true;
			}

		}
		recNodes[vertex] = false; 


		return false;
	}

}
