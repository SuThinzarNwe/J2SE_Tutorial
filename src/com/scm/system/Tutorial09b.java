/**
 * 
 */
package com.scm.system;

import java.util.Scanner;

/**
 * <h2>Tutorial09b Class</h2>
 * <p>
 * Process for Displaying Tutorial09b
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial09b {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To display the greatest number from user's input
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = input.nextInt();
		System.out.println("Enter second number");
		num2 = input.nextInt();
		System.out.println("Enter third number");
		num3 = input.nextInt();
		// to check the num1 is the greatest or not
		if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest number is " + num1);
			// to check num2 is the greatest or not
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The greatest number is " + num2);
		} else {
			System.out.println("The greatest number is " + num3);
		}
	}
}
