/**
 * 
 */
package com.scm.system;

import java.util.HashMap;

/**
 * <h2>Tutorial12c Class</h2>
 * <p>
 * Process for Displaying Tutorial12c
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial12c {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To test if a map contains a mapping for the specified key.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Red", 1);
		map.put("Green", 2);
		map.put("Black", 3);
		map.put("White", 4);
		map.put("Blue", 5);
		System.out.println(map);
		System.out.println(" ");

		System.out.println("Is key Blue exitsts?");
		// to check the key Blue exists or not
		if (map.containsKey("Blue")) {
			System.out.println("Yes - " + map.get("Blue"));
		} else {
			System.out.println("No");
		}

		System.out.println("Is key Brown exitsts?");
		// to check the key Brown exists or not
		if (map.containsKey("Brown")) {
			System.out.println("Yes" + map.get("Brown"));
		} else {
			System.out.println("No");
		}
	}
}
