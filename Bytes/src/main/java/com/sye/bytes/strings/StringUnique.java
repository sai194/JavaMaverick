package com.sye.bytes.strings;

public class StringUnique {

	public static void main(String[] args) {

		System.out.println("Is unique ?"+isUnique("Sai"));
	}
	
	public static boolean isUnique(String word) {
		word =word.toLowerCase();
		boolean []chars = new boolean[128];
		
		for (int i =0;i<word.length();i++) {
			int val =word.charAt(i);
		
			if(chars[val]) {
				
				return false;
			}
			chars[val]=true;
		}
		
		
		return true;
		
	}

}
