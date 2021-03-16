package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * ComputingSymptomsAnalytics Class computes the count of the frequency of
 * occurrences of individual symptoms listed in the source input data file
 * loaded in the ArrayList Includes the Map<String, Integer>
 * sortSymptomCount(List<String> symptoms) function
 * 
 * @author Senthil
 *
 */
public class ComputingSymptomsAnalytics {

	/**
	 * sortedSymptomOccurenceFrequencyData() is used to gather input from symptoms
	 * List<String> and compute the symptoms occurrence frequency for Trend analysis
	 * in the program
	 * 
	 * @param symptoms this provides the list of symptoms loaded in the Array list
	 *                 from the input file
	 * @return countSymptomFrequency returns the corresponding count of number of
	 *         occurrences of the symptoms
	 * @throws IOException
	 */

	Map<String, Integer> sortSymptomCount(List<String> symptoms) throws IOException {
		Map<String, Integer> countSymptomFrequency = new TreeMap<String, Integer>();

		if (symptoms != null) {
			for (String symptomList : symptoms) {
				if (!countSymptomFrequency.containsKey(symptomList)) {
					countSymptomFrequency.put(symptomList, 1);
				} else {
					int count = countSymptomFrequency.get(symptomList);
					countSymptomFrequency.put(symptomList, count + 1);
				}
			}

		}
		return countSymptomFrequency;
	}

}
