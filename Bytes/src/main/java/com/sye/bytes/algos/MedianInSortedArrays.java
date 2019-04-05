package com.sye.bytes.algos;

import java.util.Arrays;
import java.util.TreeMap;

public class MedianInSortedArrays {
	
	public static void main(String[] args) {
	
		median();
		
	}
	
	public static void median() {
		 int []a = new int[]{1,12,15}; 
		 int []b = new int[]{10, 13, 14}; 
		 int leftCounter = 0;
		 int rightCounter = 0;
		 
		 int []temp =new int[a.length+b.length];
		 int tempCounter=0;
		 while(leftCounter<a.length && rightCounter <b.length) {
			 
			 if(a[leftCounter]<b[rightCounter]) {
				 temp[tempCounter]=a[leftCounter];
				 leftCounter++;
			 }else {
				 temp[tempCounter]=b[rightCounter];
				 rightCounter++;
			 }
			 tempCounter++;
		 }
		 
		 if(leftCounter<a.length) {
			 while(leftCounter<a.length) {
				 temp[tempCounter]=a[leftCounter];
				 leftCounter++;
				 tempCounter++;
			 }
			 
		 }else if(rightCounter <b.length) {
			 while((rightCounter <b.length)) {
				 temp[tempCounter]=b[rightCounter];
				 rightCounter++;
				 tempCounter++;
			 }
		 }else {
			 
		 }
		 System.out.println("final temp "+Arrays.toString(temp));
		
	
	int median=0;
	if(temp.length%2==0) {
		median = temp[temp.length/2]+temp[(temp.length-1)/2];
		median = median/2;
	}else {
		median =temp[(temp.length-1)/2];
	}
	System.out.println("median "+median);
	}
}
