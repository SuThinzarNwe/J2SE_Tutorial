/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial04 Class</h2>
 * <p>
 * Process for Displaying Tutorial04
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial04 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To display right angle triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// loop between 1 to 10
		for (int i = 1; i <= 10; i++) {
			// loop between 1 to i
			for (int j = 1; j <= i; j++) {
				// to check j is even number or not
				if (j != 1 && j % 2 != 0) {
					System.out.print(" ");
					continue;
				}

				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
