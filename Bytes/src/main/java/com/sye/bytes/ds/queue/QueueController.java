package com.sye.bytes.ds.queue;

public class QueueController {
	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		
		myQueue.insert(99999);
		myQueue.view();
	}

}
