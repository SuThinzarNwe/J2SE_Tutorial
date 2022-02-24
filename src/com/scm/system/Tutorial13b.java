/**
 * 
 */
package com.scm.system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <h2>Tutorial13b Class</h2>
 * <p>
 * Process for Displaying Tutorial13b
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
public class Tutorial13b {

	/**
	 * <h2>main</h2>
	 * <p>
	 * To append text to an existing file
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		try {
			String data = "This is the text";
			File file = new File("C:\\note\\java.txt");
			// to check the file location exists or not
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file.getName(), true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write(data);
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
