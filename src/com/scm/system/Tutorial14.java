/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial14 Class</h2>
 * <p>
 * Process for Displaying Tutorial14
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial14 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3, i, count = 10;
		System.out.print(num1 + ", " + num2);
		// loop between 2 to 10
		for (i = 2; i < count; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
