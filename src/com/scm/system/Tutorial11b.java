/**
 * 
 */
package com.scm.system;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h2>Tutorial11b Class</h2>
 * <p>
 * Process for Displaying Tutorial11b
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial11b {
	
	/**
	 * <h2>main</h2>
	 * <p>
	 * To swap two elements in an array list.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		System.out.println(list);

		Collections.swap(list, 0, 2);

		System.out.println(list);
	}
}
