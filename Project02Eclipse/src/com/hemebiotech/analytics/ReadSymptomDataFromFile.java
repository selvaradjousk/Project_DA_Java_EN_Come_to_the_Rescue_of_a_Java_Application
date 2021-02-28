package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile  {

//	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
//	public ReadSymptomDataFromFile (String filepath) {
//		this.filepath = filepath;
//	}
//	
//	@Override
//	public List<String> GetSymptoms() {
//		ArrayList<String> result = new ArrayList<String>();
//		
//		if (filepath != null) {
//			try {
//				BufferedReader reader = new BufferedReader (new FileReader(filepath));
//				String line = reader.readLine();
//				
//				while (line != null) {
//					result.add(line);
//					line = reader.readLine();
//				}
//				reader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return result;
//	}
	
	static int headacheCount = 0;
	static int rashCount = 0;
	static int pupilCount = 0;	
	// ********* Create a method for reading input file********
	private static void getSymptoms() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(FileInputAndOutputSourceDefinition.getDataInputFileName()));
		String line = reader.readLine();

		// ********* Method for computation********
		AnalyticsCounter.calculatingSymptomOccurenceFrequencyData(reader, line);

		System.out.println("number of headaches: " + headacheCount);
		System.out.println("number of rash: " + rashCount);
		System.out.println("number of pupils: " + pupilCount);
		reader.close();
	}

}
