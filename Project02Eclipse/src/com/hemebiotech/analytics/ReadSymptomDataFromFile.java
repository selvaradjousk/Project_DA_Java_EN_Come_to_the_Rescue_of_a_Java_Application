package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReadSymptomDataFromFile class implements the ISymptomReader interface and is
 * used to read the symptom data listing in the input source file and load it
 * into a List string array
 * 
 * @author Senthil
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * ReadSymptomDataFromFile() class get filepath as an input parameter
	 * 
	 * @param filepath
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * The getFilepath() String is set to get the input filename
	 * 
	 * @return
	 */
	public String getFilepath() {
		return filepath;
	}

	/**
	 * setFilepath() receives the parameter filepath and sets for access to called
	 * methods
	 * 
	 * @param filepath
	 */
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * getSymptoms() function loads the symptoms listed in input source file and is
	 * accessible in the program calling the function referencing
	 * ReadSymptomDataFromFile class
	 * 
	 * @return result The ArrayList is returned by the function on calling
	 */

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
