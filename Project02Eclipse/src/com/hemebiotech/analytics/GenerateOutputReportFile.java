package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * GenerateOutputReportFile Class delivers sorted Data Report for Trend analysis
 * Program
 * 
 * @author Senthil
 *
 */
public class GenerateOutputReportFile {
	private FileInputAndOutputSourceDefinition inputOutputFile = new FileInputAndOutputSourceDefinition();

	/**
	 * printResults () method delivers the output results to the designated output
	 * file
	 * 
	 * @param countSymptomsOccurence parameter provides the corresponding count on
	 *                               the number of occurrences of the symptoms
	 *                               computed in the ComputingSymptomsAnalytics
	 *                               Class
	 * @param symptoms               This parameter provides the corresponding list
	 *                               of sorted parameters from the Map ArrayList
	 * @throws IOException
	 */

	void printResults(Map<String, Integer> countSymptomsOccurence) throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter(inputOutputFile.defineOutputFile());

			for (String symptomList : countSymptomsOccurence.keySet()) {
				System.out.println(
						capitalizeFirstLetter(symptomList) + "(" + countSymptomsOccurence.get(symptomList) + ") ");
				writer.write(capitalizeFirstLetter(symptomList) + "(" + countSymptomsOccurence.get(symptomList) + ") "
						+ "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}

	}

	/**
	 * capitalizeFirstLetter() - symptomList value is taken to convert the first
	 * letter to uppercase
	 * 
	 * @param symptomList
	 * @return the formated symptom value from the list after uppercasing the first
	 *         letter
	 */
	private String capitalizeFirstLetter(String symptomList) {
		if (symptomList == null || symptomList.length() == 0) {
			return symptomList;
		}
		return symptomList.substring(0, 1).toUpperCase() + symptomList.substring(1);
	}

}
