/**
 * 
 */
package com.scm.system;

import java.io.File;
import java.sql.Date;

/**
 * <h2>Tutorial13a Class</h2>
 * <p>
 * Process for Displaying Tutorial13a
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial13a {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To get last modified time of a file
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		String filePath = "D://J2SE_Tutorial";
		File file = new File(filePath);
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		System.out.println("This file was last modified at: ");
		System.out.println(date);
	}
}
