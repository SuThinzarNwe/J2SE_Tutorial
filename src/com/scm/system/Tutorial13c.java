/**
 * 
 */
package com.scm.system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * <h2>Tutorial13c Class</h2>
 * <p>
 * Process for Displaying Tutorial13c
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial13c {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To read first 3 lines from a file
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		String line = "";
		String fileName = "C:\\note\\java.txt";
		try {
			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			while (((line = reader.readLine()) != null) && reader.getLineNumber() <= 4) {
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file");
		}
	}
}
