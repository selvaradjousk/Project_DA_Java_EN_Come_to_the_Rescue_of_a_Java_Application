package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateOutputReportFile {
	// ********* Create a method for Result Output management********
	static void generateOutputResults() throws IOException {
		FileWriter writer = new FileWriter(FileInputAndOutputSourceDefinition.getDataOutputFileName());
		writer.write("headache: " + ReadSymptomDataFromFile.headacheCount + "\n");
		writer.write("rash: " + ReadSymptomDataFromFile.rashCount + "\n");
		writer.write("dialated pupils: " + ReadSymptomDataFromFile.pupilCount + "\n");
		writer.close();
	}
}
