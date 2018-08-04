
package com.capgemini.javabasics2;

import java.util.*;

/**
 * @author Pooja Karnik Program to remove a word from the sentence
 * 
 */
//removing a word from the sentence
public class RemoveWord {

	// Inputs a sentence along with a word and an integer. It then removes the word
	// present at that position in the sentence
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a sentence in Capital letters : ");
		String string = scanner.nextLine();

		string = string.toUpperCase();
		int len = string.length();
		char last = string.charAt(len - 1);

		if (last != '.' && last != '?' && last != '!') {
			System.out.println("Invalid Input. End a sentence with either '.' , '?' or '!' only");
		} else {
			StringTokenizer string1 = new StringTokenizer(string, " .?!");

			int count = string1.countTokens();

			String word = " ", answer = " ";

			System.out.println("Enter the word to delete : ");
			String delete = scanner.nextLine();

			System.out.println("Enter the word position in the sentence : ");
			int number = scanner.nextInt();

			if (number < 1 || number > count) {
				System.out.println("Sorry! The word position entered is out of range");
			} else {
				for (int i = 1; i <= count; i++) {
					word = string1.nextToken();

					if (word.equals(delete) == true && i == number) {
						continue;
					}
					answer = answer + word + " ";
				}
				System.out.println("Output : " + answer.trim() + last);
			}
		}
	}
}
