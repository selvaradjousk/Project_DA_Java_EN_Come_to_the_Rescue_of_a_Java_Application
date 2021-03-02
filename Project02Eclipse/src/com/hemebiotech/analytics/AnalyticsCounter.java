package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



/**
 * AnalyticsCounter is the main Class for the "Heme Biotech - Trend Analysis Java App"
 * This contains the Following class files to be called to perform the function of the App
 * 
 * FileInputAndOutputSourceDefinition Class - Stores and provides the input and output file definition
 * 
 * ReadSymptomDataFromFile Class - Reads and loads the input data on symptoms into ArrayList
 * 
 * ISymptomReader Interface Class - Interface file for data loading structure
 * 
 * ComputingSymptomsAnalytics Class - Performs computation of the count of occurences of the symptoms listed
 *  * 
 * GenerateOutputReportFile Class - Generates the output file with count of occurences corresponding to the symptoms listed
 * 
 * 
 * @author Senthil
 *
 */
public class AnalyticsCounter {

	/**
	 * Main function of the AnalyticsCounter for the "Heme Biotech - Trend Analysis Java App"
	 * 
	 * listedSymptomOccurenceInSourceData - ArrayList Definition
	 * loadingSymptomsIntoMap - TreeMap definition
	 * readSymptomDataFromFile - instance of ReadSymptomDataFromFile() function 
	 * calling input parameter FileInputAndOutputSourceDefinition.getDataInputFileName() into it
	 * 
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {

		List<String> listedSymptomOccurenceInSourceData = new ArrayList<String>();
		
		Map<String, Integer> loadingSymptomsIntoMap = new TreeMap<String, Integer>();
		
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
				FileInputAndOutputSourceDefinition.getDataInputFileName());
		
		listedSymptomOccurenceInSourceData = readSymptomDataFromFile.getSymptoms();
		
		loadingSymptomsIntoMap = ComputingSymptomsAnalytics.sortedSymptomOccurenceFrequencyData(listedSymptomOccurenceInSourceData);
		
		GenerateOutputReportFile.generateOutputResults(loadingSymptomsIntoMap, listedSymptomOccurenceInSourceData);
		
	}

}
