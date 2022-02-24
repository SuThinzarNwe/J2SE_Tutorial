/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial06 Class</h2>
 * <p>
 * Process for Displaying Tutorial06
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial06 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To display a number pattern
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int row = 7;
		// loop between 1 to 7
		for (int i = 1; i <= row; i++) {
			// loop between 1 to 1
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// loop between i to 7
			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// loop between 6 to 1
		for (int i = row - 1; i >= 1; i--) {
			// loop between 1 to i-1
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// loop between i to 7
			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
