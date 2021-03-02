package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * AnalyticsController is the main Class for the "Heme Biotech - Trend Analysis
 * Java App" This contains the Following class files to be called to perform the
 * function of the App
 * 
 * AnalyticsCounter Class that coordinates the functions from different classes
 * in a centralized manner
 * 
 * FileInputAndOutputSourceDefinition Class - Stores and provides the input and
 * output file definition
 * 
 * ReadSymptomDataFromFile Class - Reads and loads the input data on symptoms
 * into ArrayList
 * 
 * ISymptomReader Interface Class - Interface file for data loading structure
 * 
 * ComputingSymptomsAnalytics Class - Performs computation of the count of
 * occurences of the symptoms listed
 * 
 * GenerateOutputReportFile Class - Generates the output file with count of
 * occurences corresponding to the symptoms listed
 * 
 * 
 * @author Senthil
 *
 */
public class AnalyticsController {

	/**
	 * Main function of the AnalyticsController for the "Heme Biotech - Trend
	 * Analysis Java App"
	 * 
	 * listedSymptomOccurenceInSourceData - ArrayList Definition
	 * loadingSymptomsIntoMap - TreeMap definition readSymptomDataFromFile -
	 * instance of ReadSymptomDataFromFile() function calling input parameter
	 * FileInputAndOutputSourceDefinition.getDataInputFileName() into it
	 * 
	 * @param args
	 * @throws Exception @SuppressWarnings("static-access")
	 */

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.readInputFile();
		analyticsCounter.symptomOccurenceCount();
		analyticsCounter.sendResultToOutputFile();

	}

}
