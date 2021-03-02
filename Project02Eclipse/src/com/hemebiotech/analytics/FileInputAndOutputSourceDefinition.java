package com.hemebiotech.analytics;

/**
 * FileInputAndOutputSourceDefinition Class is designated to define the input Data source file
 * and the name of the desired output file
 * This Class provides the source and destination file for the corresponding calling functions
 * from different classes 
 * @author Senthil
 *
 */

public class FileInputAndOutputSourceDefinition {

	/**
	 * getDataOutputFileName() stores and returns the data output filename definition
	 * @return sourceOutputDataFile
	 */
	static String getDataOutputFileName() {
		String sourceOutputDataFile = "result.out";
		return sourceOutputDataFile;
	}

	/**
	 * getDataInputFileName()  stores and returns the data input filename definition
	 * @return sourceInputDataFile
	 */
	static String getDataInputFileName() {
		String sourceInputDataFile = "symptoms.txt";
		return sourceInputDataFile;
	}
}
