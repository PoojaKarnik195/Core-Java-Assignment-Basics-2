
package com.capgemini.javabasics2;

import java.util.*;

/**
 * @author Pooja Karnik Program to reverse each character in a string by preserving whitespace
 *
 */
//character by character reversing a string
public class StringReverse {

	// logic to reverse the characters in a string
	public String reverseWords(String s) {

		String words[] = s.split(" ");
		StringBuffer output = new StringBuffer();

		for (String word : words) {
			output.append(new StringBuilder(word).reverse().toString());
			output.append(" ");
		}

		output.deleteCharAt(output.length() - 1);
		return output.toString();
	}

	// taking an input string and passing it to a function to find its reverse
	public static void main(String[] args) {

		StringReverse reverse = new StringReverse();

		String input = "Let's take LeetCode contest";

		System.out.println(reverse.reverseWords(input));
	}
}
