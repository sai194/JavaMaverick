package com.sye.bytes.algos;

import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("iterative");
		iterativeFibonacciSeries(9);
		System.out.println("stream");
		streamsFibonnaciSeries(9);
		
	}

	private static void iterativeFibonacciSeries(int index) {

		int i1 = 0;
		int i2 = 1;
		int sum ;
		for (int i = 0; i < index; i++) {

			System.out.print(i1+" ");
			sum = i1+i2;
			i1=i2;
			i2=sum;

		}
		System.out.println();

	}
	
	private static void streamsFibonnaciSeries(int index) {
		
		Stream.iterate(new int[] {0,1}, 
				arr->new int[]{arr[1],arr[0]+arr[1]})
		.limit(index)
		.map(arr ->arr[0])
		.forEach(i-> System.out.print(i+" "));
		System.out.println();
		
	}
	
	

}
