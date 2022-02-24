/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial07 Class</h2>
 * <p>
 * Process for Displaying Tutorial07
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial07 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To generate characters pattern
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {

		int alphabet = 65;
		int row = 5;
		// loop between 1 to 5
		for (int i = 0; i <= row; i++) {
			// loop between o to 4
			for (int j = 0; j <= row - i; j++) {
				System.out.print((char) (alphabet + j));
			}
			// loop between 1 to 2times i
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			// loop between 4 to 0
			for (int l = row - i; l >= 0; l--) {
				if (l != row)
					System.out.print((char) (alphabet + l));
			}
			System.out.println();
		}
		// loop between 4 to 0
		for (int i = row - 1; i >= 0; i--) {
			// loop between 0 to 4
			for (int j = 0; j <= row - i; j++) {
				System.out.print((char) (alphabet + j));
			}
			// loop between 1 to 2times i
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			// loop between 4 to 0
			for (int l = row - i; l >= 0; l--) {
				// to check the row is not equal to l
				if (l != row)
					System.out.print((char) (alphabet + l));
			}
			System.out.println();
		}
	}
}
