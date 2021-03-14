package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * AnalyticsCounter Class that coordinates the functions from different classes
 * in a centralized manner
 * 
 * @class FileInputAndOutputSourceDefinition Class - Stores and provides the
 *        input and output file definition
 * 
 * @class ReadSymptomDataFromFile Class - Reads and loads the input data on
 *        symptoms into ArrayList
 * 
 * @class ISymptomReader Interface Class - Interface file for data loading
 *        structure
 * 
 * @class ComputingSymptomsAnalytics Class - Performs computation of the count
 *        of occurences of the symptoms listed
 * 
 * @class GenerateOutputReportFile Class - Generates the output file with count
 *        of occurences corresponding to the symptoms listed
 * 
 * 
 * @author Senthil
 *
 */
public class AnalyticsCounter {

	private List<String> getListedSymptoms = new ArrayList<String>();

	private Map<String, Integer> readSymptomsToMap = new TreeMap<String, Integer>();

	/**
	 * readInputFile() calls the functions that reads the source input file and
	 * loads the symptoms into array list
	 */
	public void readInputFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
				FileInputAndOutputSourceDefinition.defineInputFile());
		try {
			getListedSymptoms = readSymptomDataFromFile.getSymptoms();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * symptomOccurenceCount() used to call the functions for calculating the
	 * symptoms occurrence frequency and sorting them into TreeMap to provide sorted
	 * results of the symptoms and its counts
	 */
	public void countAndSortsymptoms() {
		try {
			readSymptomsToMap = ComputingSymptomsAnalytics.sortSymptomCount(getListedSymptoms);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * sendResultToOutputFile() used to call the functions to write the count
	 * frequency computed to output file
	 */
	public void printReportFile() {
		try {
			GenerateOutputReportFile.printResults(readSymptomsToMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
