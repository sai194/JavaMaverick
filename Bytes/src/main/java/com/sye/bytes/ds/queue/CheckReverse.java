package com.sye.bytes.ds.queue;

import java.util.Arrays;

class CheckReverse {

	// 1.Push first k elements in queue in a stack.
	// 2.Pop Stack elements and enqueue them at the end of queue
	// 3.Dequeue queue elements till "k" and append them at the end of queue
	public static myQueue reverseK(myQueue queue, int k) {

		if (!queue.isEmpty()) {
			myStack stack = new myStack(k);
			int count = 0;

			while (count < k) {
				stack.push(queue.dequeue());
				count++;
			}

			while (!stack.isEmpty()) {
				queue.enqueue(stack.pop());
			}
			System.out.println(Arrays.toString(queue.queueArray));
			int size = queue.getSize();

			for (int i = 0; i < size - k; i++) {
				queue.enqueue(queue.dequeue());
			}

		} // end of if
		return queue;
	}

	public static void main(String args[]) {

		myQueue mQ = new myQueue(5);

		mQ.enqueue(1);
		mQ.enqueue(2);
		mQ.enqueue(3);
		mQ.enqueue(4);
		mQ.enqueue(5);
		mQ = reverseK(mQ, 4);

		System.out.print("Queue: ");
		while (!mQ.isEmpty()) {
			System.out.print(mQ.dequeue() + " ");
		}
	}
}