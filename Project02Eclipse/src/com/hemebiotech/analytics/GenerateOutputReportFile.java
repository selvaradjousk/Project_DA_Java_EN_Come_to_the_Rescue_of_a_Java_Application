package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * GenerateOutputReportFile Class delivers sorted Data Report for Trend analysis Program
 * @author Senthil
 *
 */
public class GenerateOutputReportFile {

	/**
	 * generateOutputResults () method delivers the output results to the designated output file
	 * @param computingSymptomsOccurenceFrequency parameter provides the corresponding count 
	 * on the number of occurrences of the symptoms computed in the ComputingSymptomsAnalytics Class
	 * @param symptoms This parameter provides the corresponding list of sorted parameters from the Map ArrayList
	 * @throws IOException
	 */

	static void generateOutputResults(Map<String, Integer> computingSymptomsOccurenceFrequency, List<String> symptoms)
			throws IOException {
		FileWriter writer = new FileWriter(FileInputAndOutputSourceDefinition.getDataOutputFileName());
		for (String symptomList : computingSymptomsOccurenceFrequency.keySet()) {
			System.out.println(symptomList + "(" + computingSymptomsOccurenceFrequency.get(symptomList) + ") ");
			writer.write(symptomList + "(" + computingSymptomsOccurenceFrequency.get(symptomList) + ") " + "\n");
		}
		writer.close();
	}
}
