package com.sye.bytes.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * http://www.java67.com/2015/12/producer-consumer-solution-using-blocking-queue-java.html
 */
public class ProducerConsumerSolution {
	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>();
		Producer p = new Producer(sharedQ);
		Consumer c = new Consumer(sharedQ);
		p.start();
		c.start();
	}
}


					