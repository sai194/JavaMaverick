package com.sye.bytes.ds.graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

class CheckMin {

	public static int findMin(UndirectedGraph g, int source, int destination) {
		boolean []visited = new boolean[g.vertices];
		int[] distances = new int[g.vertices];
		
		Queue q = new LinkedList();
		q.add(source);
		
		visited[source]=true;
		
		while(!q.isEmpty()) {
			
			int node = (int)q.poll();
			ListIterator iter =g.array[node].listIterator();
			
			while(iter.hasNext()) {
				int temp =(int)iter.next();
				
				if(!visited[temp]) {
					visited[temp]=true;
					q.add(temp);
					distances[temp]=distances[node]+1;
				}
				if(temp==destination) {
					return distances[temp];
				}
			}
			
		}

		return -1;
	}
  
  public static void main(String args[]) {
    
	 UndirectedGraph g = new UndirectedGraph(7);
    g.addEdge(1,2);
    g.addEdge(1,3);
    g.addEdge(2,4);
    g.addEdge(4,5);
    g.addEdge(2,5);
    g.addEdge(5,6);
    g.addEdge(3,6);
    System.out.println(findMin(g, 1, 6));
  }
}