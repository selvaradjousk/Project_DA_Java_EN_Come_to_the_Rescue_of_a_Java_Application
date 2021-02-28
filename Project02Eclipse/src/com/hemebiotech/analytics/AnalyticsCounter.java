package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class AnalyticsCounter {


	public static void main(String[] args) throws Exception {

		ReadSymptomDataFromFile.getSymptoms();
		generateOutputResults();
	}

	// ********* Create a method for Result Output management********
	private static void generateOutputResults() throws IOException {
		FileWriter writer = new FileWriter(FileInputAndOutputSourceDefinition.getDataOutputFileName());
		writer.write("headache: " + ReadSymptomDataFromFile.headacheCount + "\n");
		writer.write("rash: " + ReadSymptomDataFromFile.rashCount + "\n");
		writer.write("dialated pupils: " + ReadSymptomDataFromFile.pupilCount + "\n");
		writer.close();
	}




}
