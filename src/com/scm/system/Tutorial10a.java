/**
 * 
 */
package com.scm.system;

/**
 * <h2>Tutorial10a Class</h2>
 * <p>
 * Process for Displaying Tutorial10a
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial10a {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To calculate the average value of array elements
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int[] num = new int[] { 3, 4, 5, 7, 9 };
		int sum = 0;
		// loop between 0 to 4
		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];
		}
		double average = sum / num.length;
		System.out.println("The average number is " + average);
	}
}
