package com.sye.bytes.strings;

class removeSpaces {
	// Null terminating strings are not used in Java.
	// For this question, assume that you are passed a
	// null terminated string (array of characters).
	static boolean is_white_char(char c) {
		// there can be more white space characters
		// but for simplicity lets assume that we have
		// only two white space character
		// i.e. space and tab
		if (c == ' ' || c == '\t') {
			return true;
		}
		return false;
	}

	static void remove_white_spaces(char[] s) {
		if (s == null || s.length == 0 || s[0] == '\0') {
			return;
		}

		// We will use read, write pointers here.
		// Write pointer will follow the read pointer
		// and only write characters read that are neither
		// a space (' ') nor a tab ('\t').

		int read_ptr = 0;
		int write_ptr = 0;
		while (read_ptr < s.length && s[read_ptr] != '\0') {
			// Lets assume there are only two white
			// space characters: space and tab.
			if (!is_white_char(s[read_ptr])) {
				s[write_ptr] = s[read_ptr];
				++write_ptr;
			}
			++read_ptr;
		}

		// Let's mark the end of string.
		s[write_ptr] = '\0';
	}

	public static void main(String[] args) {
		char[] s = getArray("Hello World!");
		print(s);
		remove_white_spaces(s);
		print(s);


		s = getArray("    Quick brown fox jumped   over lazy   dog           ");

		print(s);
		remove_white_spaces(s);
		print(s);

	}

	static void print(char[] s) {
		int i = 0;
		while (s[i] != '\0') {
			System.out.print(s[i]);
			++i;
		}
		System.out.println();
	}

	static char[] getArray(String t) {
		char[] s = new char[t.length() + 1];
		int i = 0;
		for (; i < t.length(); ++i) {
			s[i] = t.charAt(i);
		}
		s[i] = '\0';
		return s;
	}
}