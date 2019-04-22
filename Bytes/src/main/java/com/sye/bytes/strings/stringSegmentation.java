package com.sye.bytes.strings;

import java.util.HashSet;
import java.util.Set;

class stringSegmentation{
  public static boolean can_segment_string(String s, Set<String> dict) {
    Set<String> solved = new HashSet<String>();
    return can_segment_string(s, dict, solved);
  }

  public static boolean can_segment_string(String s, Set<String> dict, Set<String> solved) {
  	  for (int i = 1; i <= s.length(); ++i) {
    	  String first = s.substring(0, i);
    	  if (dict.contains(first)) {
      		  String second = s.substring(i);

      		  if (second == null || second.length() == 0 || dict.contains(second)) {
        		  return true;
      		  }

      		  if (!solved.contains(second)) {
        		  if (can_segment_string(second, dict, solved)) {
          			  return true;
        		  }
        		  solved.add(second);
      		  }
    	  }
  	  }
  	  return false;
  }
  public static void main(String[] args) {
    Set<String> dict = new HashSet<String>();
    String s = new String();
    s = "applepie";

    dict.add("pie");
    dict.add("pear");
    dict.add("apple");
    dict.add("peach");

    System.out.println("Result = " + can_segment_string(s, dict));
  }
}  