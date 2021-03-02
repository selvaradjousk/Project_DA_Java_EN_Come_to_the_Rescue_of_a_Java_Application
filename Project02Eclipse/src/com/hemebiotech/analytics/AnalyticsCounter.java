package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	
	static List<String> listedSymptomOccurenceInSourceData = new ArrayList<String>();
	
	static Map<String, Integer> loadingSymptomsIntoMap = new TreeMap<String, Integer>();
	
	ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
			FileInputAndOutputSourceDefinition.getDataInputFileName());
	
	listedSymptomOccurenceInSourceData = readSymptomDataFromFile.getSymptoms();
	
	loadingSymptomsIntoMap = ComputingSymptomsAnalytics.sortedSymptomOccurenceFrequencyData(listedSymptomOccurenceInSourceData);
	
	GenerateOutputReportFile.generateOutputResults(loadingSymptomsIntoMap, listedSymptomOccurenceInSourceData);
	
}
