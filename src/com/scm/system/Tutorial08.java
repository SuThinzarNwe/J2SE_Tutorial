/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial08 Class</h2>
 * <p>
 * Process for Displaying Tutorial08
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial08 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To generate character pattern
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int alphabet = 65;
		int row = 9;
		int temp = 1;
		// loop between 1 to 5
		for (int i = 1; i <= row / 2 + 1; i++) {
			// loop between 1 to i
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (alphabet + (temp * j) - 1) + " ");
			}

			System.out.println(" ");
			temp++;
		}
		// loop between 1 to 4
		for (int i = 1; i <= row / 2; i++) {
			// loop between 1 to 5
			for (int j = 1; j <= row / 2 + 1 - i; j++) {
				System.out.print((char) (alphabet + (temp * j) - 1) + " ");

			}
			System.out.println();
			temp++;
		}
	}
}
