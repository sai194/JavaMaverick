package com.sye.bytes.ds.graph;

import java.util.Iterator;
import java.util.Stack;

public class CheckGraphPathSourceAndDestination {

	public static void main(String[] args) {
		  
	    Graph g1 = new Graph(9);
	    g1.addEdge(0,2);
	    g1.addEdge(0,5);
	    g1.addEdge(2,3);
	    g1.addEdge(2,4);
	    g1.addEdge(5,3);
	    g1.addEdge(5,6);
	    g1.addEdge(3,6);
	    g1.addEdge(6,7);
	    g1.addEdge(6,8);
	    g1.addEdge(6,4);
	    g1.addEdge(7,8);
	    
	    Graph g2 = new Graph(4);
	    g2.addEdge(0,1);
	    g2.addEdge(1,2);
	    g2.addEdge(1,3);
	    g2.addEdge(2,3);

	    System.out.println(checkPath(g1, 0, 7));
	    System.out.println(checkPath(g2, 3, 0));
	  
	}
	
	public static boolean checkPath(Graph g, int source, int destination) {
		
		Stack stk = new Stack();
		boolean []visited = new boolean[g.vertices];
		
		visited[source]=true;
		stk.push(source);
		
		while(!stk.isEmpty()) {
			int node = (int) stk.pop();
			Iterator iter = g.array[node].iterator();
			while(iter.hasNext()) {
				int temp = (int)iter.next();
				if(!visited[temp]) {
					
					if(destination == temp) {
						return true;
					}
					visited[temp]=true;
					stk.push(temp);
					
				}
			}
		}
		
		return false;
		
	}

}
