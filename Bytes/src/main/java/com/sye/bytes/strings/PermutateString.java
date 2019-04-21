package com.sye.bytes.strings;

public class PermutateString {

	public static void main(String[] args) {
		String str = "aba";
		int n = str.length();
		permute(str, "");
		System.out.println();
		printDistinctPermutn(str, "");

	}

	public static void permute(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			// ith character of str
			char ch = str.charAt(i);
			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			permute(ros, ans + ch);
		}

	}

	public static String swap(String a, int i, int j) {

		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);

	}

	static void printDistinctPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {

			// print ans
			System.out.print(ans + " ");
			return;
		}

		// Make a boolean array of size '26' which
		// stores false by default and make true
		// at the position which alphabet is being
		// used
		boolean alpha[] = new boolean[26];

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// If the character has not been used
			// then recursive call will take place.
			// Otherwise, there will be no recursive
			// call
			if (alpha[ch - 'a'] == false)
				printDistinctPermutn(ros, ans + ch);
			alpha[ch - 'a'] = true;
		}
	}

}
