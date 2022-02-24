/**
 * 
 */
package com.scm.system;

import java.util.Arrays;

/**
 * <h2>Tutorial10b Class</h2>
 * <p>
 * Process for Displaying Tutorial10b
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial10b {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To remove a specific element from an array
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36 };
		System.out.println("Original Array: " + Arrays.toString(my_array));

		int removeIndex = 1;
		// loop between 1 to 4
		for (int i = removeIndex; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
			System.out.println("Removed Array: " + Arrays.toString(my_array));
		}
	}
}