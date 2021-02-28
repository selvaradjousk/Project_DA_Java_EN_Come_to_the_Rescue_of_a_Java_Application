package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GenerateOutputReportFile {
	// ********* Create a method for Result Output management********
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
