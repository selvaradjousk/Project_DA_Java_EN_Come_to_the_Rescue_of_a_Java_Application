package com.hemebiotech.analytics;

/**
 * FileInputAndOutputSourceDefinition Class is designated to define the input
 * Data source file and the name of the desired output file This Class provides
 * the source and destination file for the corresponding calling functions from
 * different classes
 * 
 * @author Senthil
 *
 */

public class FileInputAndOutputSourceDefinition {

	/**
	 * defineOutputFile() stores and returns the data output filename definition
	 * 
	 * @return outputFileName
	 */
	String defineOutputFile() {
		final String outputFileName = "result.out";
		return outputFileName;
	}

	/**
	 * defineInputFile() stores and returns the data input filename definition
	 * 
	 * @return inputFileName
	 */
	String defineInputFile() {
		final String inputFileName = "symptoms.txt";
		return inputFileName;
	}
}
