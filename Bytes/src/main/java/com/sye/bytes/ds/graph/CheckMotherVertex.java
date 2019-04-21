package com.sye.bytes.ds.graph;

import java.util.Arrays;

public class CheckMotherVertex {
	
	public static int motherVertex(Graph g) {
		
		boolean []visited = new boolean[g.vertices];
		int lastV=-1;
		Arrays.fill(visited, false);
		
		for (int i=0;i< g.vertices;i++) {
			
			if(!visited[i]) {
				visited = CheckDFS.dfsTraversal(g, i, visited);
				lastV=i;
			}
		}
		
		Arrays.fill(visited, false);
		visited = CheckDFS.dfsTraversal(g, lastV, visited);
		for(int i=0; i<visited.length;i++) {
			if(!visited[i]) {
			
				return -1;
			}
		}
		
		return lastV;
		
		
	}
	

}
