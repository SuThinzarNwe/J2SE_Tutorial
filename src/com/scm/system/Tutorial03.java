/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial03 Class</h2>
 * <p>
 * Process for Displaying Tutorial03
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial03 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To display pattern like right triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int row = 10;
		// loop between 1 to 10
		for (int i = 1; i <= row; i++) {
			// to output the number
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
