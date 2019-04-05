package com.sye.bytes.strings;

/*
 * Like in many questions, we should confirm some details with our interviewer. We should understand if the
permutation comparison is case sensitive. That is: is God a permutation of dog? Additionally, we should
ask if whitespace is significant. We will assume for this problem that the comparison is case sensitive and
whitespace is significant. So, "god " is different from "dog".
Observe first that strings of different lengths cannot be permutations of each other. There are two easy
ways to solve this problem, both of which use this optimization.
 */
public class StringPermuationIdentical {

	public static void main(String []args) {
		
		String first ="sai";
		String second ="ias";
		
		System.out.println("is identical?"+checkIdentical(first,second));
				
	}

	private static boolean checkIdentical(String first, String second) {
		
		//Consider ascii set
		if(first.length()!=second.length()) {
			return false;
		}
		int []val =new int[128];
		for(int i=0; i<first.length();i++) {
			val[first.charAt(i)]++;
		}
		
		for(int i=0; i<second.length();i++) {
			val[second.charAt(i)]--;
			if(val[second.charAt(i)]<0) {
				return false;
			}
		}
		
		return true;
		
	}
}
