package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class AnalyticsCounter {


	public static void main(String[] args) throws Exception {

		getSymptoms();
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

	// ********* Create a method for reading input file********
	private static void getSymptoms() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(FileInputAndOutputSourceDefinition.getDataInputFileName()));
		String line = reader.readLine();

		// ********* Method for computation********
		calculatingSymptomOccurenceFrequencyData(reader, line);

		System.out.println("number of headaches: " + ReadSymptomDataFromFile.headacheCount);
		System.out.println("number of rash: " + ReadSymptomDataFromFile.rashCount);
		System.out.println("number of pupils: " + ReadSymptomDataFromFile.pupilCount);
		reader.close();
	}

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
