package com.sye.bytes.strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class removeDuplicates{
  // this solution uses extra memory
  // to keep all characters present in string.

  // Null terminating strings are not used in Java.
  // For this question, assume that you are passed a
  // null terminated string (array of characters).
  private static char[] remove_duplicates(char[] str){
    Set<Character> hashset = 
          new LinkedHashSet<Character>();  
  
    int write_index = 0;
    int read_index = 0;

    while (read_index <str.length) {
    
      if(!hashset.contains(str[read_index])) {
      
        hashset.add(str[read_index]);
        str[write_index] = str[read_index];
        ++write_index;
      }

      ++read_index;
    }
   
    	str[write_index] = '\0';
    	write_index++;
  

    
    return str;
  }
    /// Test Program.
  public static void main(String[] args) {
	  print(remove_duplicates("aabbccddefffgfijk".toCharArray()));
	  print(remove_duplicates("Hello World!".toCharArray()));
	  /*remove_duplicates("   Quick brown fox jumped   over lazy   dog           ");
	  remove_duplicates("aaaaaaaaaaa");
	  remove_duplicates("aaaaaaaaaaabbbbbbbb");
	  remove_duplicates("abbabcddbabcdeedebc");*/
  }
  
  static void print(char[] s) {
	    int i = 0;
	    while (s[i] != '\0') {
	      System.out.print(s[i]);
	      ++i;
	    }
	    System.out.println();
	  }
	
}  