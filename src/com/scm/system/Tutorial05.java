/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial05 Class</h2>
 * <p>
 * Process for Displaying Tutorial05
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial05 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To display * triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int row = 6;
		// loop between 1 to 6
		for (int i = 1; i <= row; i++) {
			// loop between 6 to i
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
