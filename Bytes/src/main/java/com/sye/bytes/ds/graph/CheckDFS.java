package com.sye.bytes.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

//Create Stack => myStack stack = new myStack(5) ; where 5 is size of stack
//Functions of Stack => stack.push(int),stack.pop(),top(),isEmpty() 
//class graph => {int vertices, linkedList[] array}
//class linkedList => {Node headNode}
//class Node => {int data, Node nextElement}
class CheckDFS {

  //Depth First Traversal of Graph g from source vertex  
  public static String dfsTraversal(Graph g, int source) {
	  String result = "";
	    int num_of_vertices = g.vertices;
	    boolean[] visited = new boolean[num_of_vertices];
	    
	    Stack<Integer> stk = new Stack<>(); 
	    
	    stk.push(source);
	    visited[source] = true;

	    
	    while(!stk.isEmpty()) {
	    	int current_node = stk.pop();
	    	result += String.valueOf(current_node);
	    	
	    	LinkedList list = g.array[current_node];
	    	Iterator iter = list.iterator();
	    	while(iter.hasNext()) {
	    		Integer vertex = (Integer) iter.next();
	    		if(!visited[vertex]) {
	    			stk.add(vertex);
	    			visited[vertex]=true;
	    		}
	    	}
	    }
    return result; //For the above graph, it should return "12453" or "13254"
  }
}