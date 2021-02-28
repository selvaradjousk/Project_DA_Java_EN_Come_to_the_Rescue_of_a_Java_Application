package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;

public class ComputingSymptomsAnalytics {
	// ********* Create a method for computation********
	static void calculatingSymptomOccurenceFrequencyData(BufferedReader reader, String symptoms) throws IOException {
		while (symptoms != null) {
			if (symptoms.equals("headache")) {
				ReadSymptomDataFromFile.headacheCount++;
			} else if (symptoms.equals("rash")) {
				ReadSymptomDataFromFile.rashCount++;
			} else if (symptoms.contains("dialated pupils")) {
				ReadSymptomDataFromFile.pupilCount++;
			}

			symptoms = reader.readLine();
		}
	}

}
