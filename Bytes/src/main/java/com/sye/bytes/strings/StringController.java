package com.sye.bytes.strings;

import java.util.Arrays;

public class StringController {
	
	public static void main(String []args) {
		
		StringController ctrl = new StringController();
		ctrl.reverseString("reverse");
		ctrl.reverseArray(new char[] {'1','2','3','4','5'});
	}
	
	public String reverseString(String word) {
		System.out.println("Begin  reverseString "+word);
		StringBuffer reverse = new StringBuffer();
		
		for(int i=word.length()-1;i>=0;i--) {
			reverse.append(word.charAt(i));
		}
		
		System.out.println("End reverseString "+reverse);
		
		return reverse.toString();
		
	}
	
	public char[] reverseArray(char []arr) {
		System.out.println("Begin  reverseArray "+Arrays.toString(arr));
		int mid = arr.length/2;
		
		for(int i=0 ;i<mid;i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("End reverseArray "+Arrays.toString(arr));
		return arr;
	}

}
