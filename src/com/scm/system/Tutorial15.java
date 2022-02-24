/**
 * 
 */
package com.scm.system;

import java.util.Scanner;

/**
 * <h2>Tutorial15 Class</h2>
 * <p>
 * Process for Displaying Tutorial15
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial15 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		original = input.nextLine();
		int length = original.length();
		// loop between
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		// to check the first letter is equal to the last letter or not
		if (original.equals(reverse)) {
			System.out.println("Your number is palindrome");
		} else {
			System.out.println("Your number isn't plaindrome");
		}

	}
}
