
package com.capgemini.javabasics2;

import java.util.*;

/**
 * @author Pooja Karnik Program to check if a string is present in the array
 *
 */
//comparing the input string with array of strings to find a match
public class SearchString {

	String searchString;
	int count = 0;
	String name[] = { "Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev",
			"Kitty", "Meery", "Smith", "Jhonson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
			"Moore", "Taylor", "Anderson", "Thomas", "Jackson" };

	// counting each character of the input string if it is found equal to string
	// array
	public void searchResult(String names) {
		searchString = names;

		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(searchString)) {
				count++;
			}
		}
		System.out.println("Number of occurance : " + count);
	}

	// taking input string and creating an object to call the searchResult method to
	// process the input
	public static void main(String[] args) {

		SearchString search = new SearchString();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = scanner.next();

		search.searchResult(name);
	}
}
