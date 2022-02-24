/**
 * 
 */
package com.scm.system;

import java.util.HashMap;

/**
 * <h2>Tutorial12b Class</h2>
 * <p>
 * Process for Displaying Tutorial12b
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial12b {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To copy all of the mappings from the specified map to another map
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> colors1 = new HashMap<Integer, String>();
		HashMap<Integer, String> colors2 = new HashMap<Integer, String>();
		colors1.put(1, "Red");
		colors1.put(2, "Green");
		colors1.put(3, "Black");
		System.out.println("Value in first map: " + colors1);

		colors2.put(4, "White");
		colors2.put(5, "Blue");
		colors2.put(6, "Grey");
		System.out.println("Valye in second map: " + colors2);

		colors2.putAll(colors1);
		System.out.println("Values of all together: " + colors2);
	}
}
