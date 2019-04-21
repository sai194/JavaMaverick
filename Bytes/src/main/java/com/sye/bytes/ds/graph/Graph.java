package com.sye.bytes.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	// Total number of vertices in graph
	int vertices;
	// Array to store Adjacency Linked-Lists of all vertices
	LinkedList[] array;

	public Graph(int vertices) {
		super();
		this.vertices = vertices;
		array = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			array[i] = new LinkedList();
		}
	}

	// Prints Graph (Adjaceny List)
	public void printGraph() {
		System.out.println(">>Adjacency List of Directed Graph<<");
		for (int i = 0; i < vertices; i++) {
			System.out.print("|" + i + "| => ");
			LinkedList list = array[i];
			Iterator iter =list.iterator();
			while(iter.hasNext()) {
				System.out.print("[" + iter.next() + "] -> ");
			}
		}

	}

	// Adds an Edge from source vertex to destination vertex
	@SuppressWarnings("unchecked")
	public void addEdge(int source, int destination) {

		array[source].addFirst(destination);

	}

}
