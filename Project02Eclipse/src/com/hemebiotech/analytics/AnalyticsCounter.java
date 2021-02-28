package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class AnalyticsCounter {


	public static void main(String[] args) throws Exception {

		ReadSymptomDataFromFile.getSymptoms();
		GenerateOutputReportFile.generateOutputResults();
	}






}
