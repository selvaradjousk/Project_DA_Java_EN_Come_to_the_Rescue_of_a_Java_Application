package com.hemebiotech.analytics;

/**
 * AnalyticsController is the main Class for the "Heme Biotech - Trend Analysis
 * Java App" This contains the AnalyticsCounter Class that coordinates the
 * functions from different classes in a centralized manner cordinating the
 * classes with different functions in FileInputAndOutputSourceDefinition Class,
 * ReadSymptomDataFromFile Class, ISymptomReader Interface Class,
 * ComputingSymptomsAnalytics Class, GenerateOutputReportFile Class
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
	 * 
	 */

	public static void main(String[] args) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.readInputFile();
		analyticsCounter.countAndSortsymptoms();
		analyticsCounter.printReportFile();

	}

}
