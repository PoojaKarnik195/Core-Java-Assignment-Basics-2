
package com.capgemini.javabasics2;

import java.util.*;

/**
 * @author Pooja Karnik Program to find the palindrome of a number
 *
 */
public class Palindrome {

	// taking input number, finding its reverse and comparing it with the original
	// number to check if it is same or not
	public static void main(String[] args) {

		int reverse = 0, digit;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();

		int temp = number;

		while (number > 0) {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		if (temp == reverse) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
