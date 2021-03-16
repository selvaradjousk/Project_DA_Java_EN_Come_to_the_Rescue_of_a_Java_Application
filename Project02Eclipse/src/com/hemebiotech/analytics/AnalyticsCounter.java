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
 *        of occurrences of the symptoms listed
 * 
 * @class GenerateOutputReportFile Class - Generates the output file with count
 *        of occurrences corresponding to the symptoms listed
 * 
 * 
 * @author Senthil
 *
 */
public class AnalyticsCounter {

	private List<String> getListedSymptoms = new ArrayList<String>();
	private Map<String, Integer> readSymptomsToMap = new TreeMap<String, Integer>();
	private FileInputAndOutputSourceDefinition inputOutputFile = new FileInputAndOutputSourceDefinition();
	private GenerateOutputReportFile printOutputReportFile = new GenerateOutputReportFile();
	private ComputingSymptomsAnalytics computingSymptomsAnalytics = new ComputingSymptomsAnalytics();

	/**
	 * readInputFile() calls the functions that reads the source input file and
	 * loads the symptoms into array list
	 */
	void readInputFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
				inputOutputFile.defineInputFile());
		try {
			getListedSymptoms = readSymptomDataFromFile.getSymptoms();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * countAndSortsymptoms() used to call the functions for calculating the
	 * symptoms occurrence frequency and sorting them into TreeMap to provide sorted
	 * results of the symptoms and its counts
	 */
	void countAndSortsymptoms() {
		try {
			readSymptomsToMap = computingSymptomsAnalytics.sortSymptomCount(getListedSymptoms);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * printReportFile() used to call the functions to write the count frequency
	 * computed to output file
	 */
	void printReportFile() {
		try {
			printOutputReportFile.printResults(readSymptomsToMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
