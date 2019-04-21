package com.sye.bytes.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Create Queue => myQueue queue = new myQueue(5) ; where 5 is size of queue
//Functions of Queue => queue.enqueue(int) , queue.dequeue(), size(), peek() , isEmpty() 
//class graph => {int vertices, linkedList[] array}
//class linkedList => {Node headNode}
//class Node => {int data, Node nextElement}
class CheckBFS {

  //Breadth First Traversal of Graph g from source vertex 
  public static String bfsTraversal(Graph g, int source) {
    String result = "";
    int num_of_vertices = g.vertices;
    boolean[] visited = new boolean[num_of_vertices];
    
    Queue<Integer> q = new LinkedList<>(); 
    
    q.add(source);
    visited[source] = true;

    
    while(!q.isEmpty()) {
    	int current_node = q.poll();
    	result += String.valueOf(current_node);
    	
    	LinkedList list = g.array[current_node];
    	Iterator iter = list.iterator();
    	while(iter.hasNext()) {
    		Integer vertex = (Integer) iter.next();
    		if(!visited[vertex]) {
    			q.add(vertex);
    			visited[vertex]=true;
    		}
    	}
    }
    // Write - Your - Code
    return result; //For the above graph, it should return "12345" or "13254"
  }

}