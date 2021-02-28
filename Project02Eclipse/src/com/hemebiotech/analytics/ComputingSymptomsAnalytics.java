package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;

public class ComputingSymptomsAnalytics {
	// ********* Create a method for computation********
	static void calculatingSymptomOccurenceFrequencyData(BufferedReader reader, String line)
			throws IOException {
		while (line != null) {
			if (line.equals("headache")) {
				ReadSymptomDataFromFile.headacheCount++;
			} else if (line.equals("rash")) {
				ReadSymptomDataFromFile.rashCount++;
			} else if (line.contains("dialated pupils")) {
				ReadSymptomDataFromFile.pupilCount++;
			}

			line = reader.readLine();
		}
	}

}
