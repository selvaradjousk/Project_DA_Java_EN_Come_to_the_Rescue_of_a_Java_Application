package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ComputingSymptomsAnalytics {
	// ********* Create a method for computation********
	public static Map<String, Integer> sortedSymptomOccurenceFrequencyData(List<String> symptoms) throws IOException {
		Map<String, Integer> computingSymptomsOccurenceFrequency = new TreeMap<String, Integer>();

		if (symptoms != null) {
			for (String symptomList : symptoms) {
				if (!computingSymptomsOccurenceFrequency.containsKey(symptomList)) {
					computingSymptomsOccurenceFrequency.put(symptomList, 1);
				} else {
					int count = computingSymptomsOccurenceFrequency.get(symptomList);
					computingSymptomsOccurenceFrequency.put(symptomList, count + 1);
				}
			}

		}
		return computingSymptomsOccurenceFrequency;
	}

}
