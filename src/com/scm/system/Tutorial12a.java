/**
 * 
 */
package com.scm.system;

import java.util.HashMap;
import java.util.Map;

/**
 * <h2>Tutorial12a Class</h2>
 * <p>
 * Process for Displaying Tutorial12a
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial12a {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To associate the specified value with the specified key in a HashMap.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer, String> fruits = new HashMap<Integer, String>();
		fruits.put(1, "apple");
		fruits.put(2, "orange");
		fruits.put(3, "pineapple");
		fruits.put(4, "watermelon");
		fruits.put(5, "guava");
		for (Map.Entry x : fruits.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
