package com.hemebiotech.analytics;

public class FileInputAndOutputSourceDefinition {

	// ********* Create a method for input and output file management********
	static String getDataOutputFileName() {
		String sourceOutputDataFile = "result.out";
		return sourceOutputDataFile;
	}

	static String getDataInputFileName() {
		String sourceInputDataFile = "symptoms.txt";
		return sourceInputDataFile;
	}
}
