package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	static List<String> listedSymptomOccurenceInSourceData = new ArrayList<String>();

	static Map<String, Integer> loadingSymptomsIntoMap = new TreeMap<String, Integer>();

	/**
	 * readInputFile() calls the functions that reads the source input file and
	 * loads the symptoms into array list
	 */
	public static void readInputFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
				FileInputAndOutputSourceDefinition.getDataInputFileName());
		listedSymptomOccurenceInSourceData = readSymptomDataFromFile.getSymptoms();
	}

	/**
	 * symptomOccurenceCount() used to call the functions for calculating the
	 * symptoms occurrence frequency and sorting them into TreeMap to provide sorted
	 * results of the symptoms and its counts
	 */
	public static void symptomOccurenceCountAndSorting() {
		try {
			loadingSymptomsIntoMap = ComputingSymptomsAnalytics
					.sortedSymptomOccurenceFrequencyData(listedSymptomOccurenceInSourceData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * sendResultToOutputFile() used to call the functions to that sends the count
	 * frequency computed to output file
	 */
	public static void sendResultToOutputFile() {
		try {
			GenerateOutputReportFile.generateOutputResults(loadingSymptomsIntoMap, listedSymptomOccurenceInSourceData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
