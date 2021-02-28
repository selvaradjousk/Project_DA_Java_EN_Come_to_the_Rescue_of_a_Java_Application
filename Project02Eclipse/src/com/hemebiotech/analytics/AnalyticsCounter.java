package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;

	public static void main(String[] args) throws Exception {

		// ********* Create a method for input and output file management********
		// ********* Create a method for reading input file********
		BufferedReader reader = new BufferedReader(new FileReader(getDataInputFileName()));
		String line = reader.readLine();

		// ********* Create a method for computation********
		calculatingSymptomOccurenceFrequencyData(reader, line);

		System.out.println("number of headaches: " + headacheCount);
		System.out.println("number of rash: " + rashCount);
		System.out.println("number of pupils: " + pupilCount);
		reader.close();
		// ********* Create a method for Result Output management********
		FileWriter writer = new FileWriter(getDataOutputFileName());
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}

	private static void calculatingSymptomOccurenceFrequencyData(BufferedReader reader, String line)
			throws IOException {
		while (line != null) {
			if (line.equals("headache")) {
				headacheCount++;
			} else if (line.equals("rash")) {
				rashCount++;
			} else if (line.contains("dialated pupils")) {
				pupilCount++;
			}

			line = reader.readLine();
		}
	}

	private static String getDataOutputFileName() {
		String sourceOutputDataFile = "result.out";
		return sourceOutputDataFile;
	}

	private static String getDataInputFileName() {
		String sourceInputDataFile = "symptoms.txt";
		return sourceInputDataFile;
	}
}
