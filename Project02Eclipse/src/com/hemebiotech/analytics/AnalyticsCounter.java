package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	
	static List<String> listedSymptomOccurenceInSourceData = new ArrayList<String>();
	
	static Map<String, Integer> loadingSymptomsIntoMap = new TreeMap<String, Integer>();
	
	public static void readInputFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
				FileInputAndOutputSourceDefinition.getDataInputFileName());
		listedSymptomOccurenceInSourceData = readSymptomDataFromFile.getSymptoms();
	}
	
	public static void symptomOccurenceCount() {	
	try {
		loadingSymptomsIntoMap = ComputingSymptomsAnalytics.sortedSymptomOccurenceFrequencyData(listedSymptomOccurenceInSourceData);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void sendResultToOutputFile() {
	try {
		GenerateOutputReportFile.generateOutputResults(loadingSymptomsIntoMap, listedSymptomOccurenceInSourceData);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
