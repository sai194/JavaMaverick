package com.sye.bytes.ds.graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

class checkTree {

	public static boolean isTree(UndirectedGraph g) {

		boolean hasCycle = true;
		boolean isConnected = false;

		int start = 3;

		//1. Check for Cycle 
		hasCycle = checkCycle(g, start);

		//2. Check for connectivity
		isConnected = checkConnected(g, start);

		System.out.println("has cycle : " + hasCycle + " is Connected : " + isConnected);

		if (!hasCycle && isConnected) return true; //It's a Tree

		return false; //Not a Tree
	}

	private static boolean checkCycle(UndirectedGraph g, int source) {

		boolean[] visited = new boolean[g.vertices];
		int[] parent = new int[g.vertices];

		Stack stk = new Stack();

		stk.push(source);
		visited[source] = true;
		
		while (!stk.isEmpty()) {
			int node = (int) stk.pop();
			Iterator iter = g.array[node].iterator();

			while (iter.hasNext()) {	

				int temp =(int)iter.next();
				if (!visited[temp]) {
					stk.push(temp);
					visited[temp] = true;
					parent[temp]=node;
				}
				else if (visited[temp] && temp!=parent[node]) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean checkConnected(UndirectedGraph g, int source) {
		
		boolean[] visited = new boolean[g.vertices];
		int verticesCnt =0;
		
		Stack stk = new Stack();
		
		stk.push(source);
		visited[source]=true;
		
		while(!stk.isEmpty()) {
			int node = (int)stk.pop();
			ListIterator iter = g.array[node].listIterator();
			
			while(iter.hasNext()) {
				int temp = (int)iter.next();
				
				if(!visited[temp]) {
					visited[temp]=true;
					stk.push(temp);
					verticesCnt++;
				}
			
			}
			
			
		}
		
		System.out.println(Arrays.toString(visited)+" "+verticesCnt);

		return (verticesCnt+1 == g.vertices);
	}

	public static void main(String args[]) {

		UndirectedGraph g = new UndirectedGraph(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(3, 4);

		UndirectedGraph g2 = new UndirectedGraph(5);
		g2.addEdge(1, 0);
		g2.addEdge(0, 2);
		g2.addEdge(2, 1);
		g2.addEdge(0, 3);
		g2.addEdge(3, 4);

		System.out.println(isTree(g));
		System.out.println(isTree(g2));

	}
}