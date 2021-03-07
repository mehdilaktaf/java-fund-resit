package fr.epita.persondata.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestSER1 {
	
	// STATIC VARIABLES
	private static final String DELIMITOR = ",";
	private static final String FILENAME = "data.csv";

	public static void test() {
		
		// This array will hold the column names from csv file
		String[] attributeNames;
		
	    try {
	    	BufferedReader reader = new BufferedReader(new FileReader(new File(FILENAME)));
	    	
	    	// Get headers 
	    	String line = reader.readLine().trim();
	    	attributeNames = line.split(DELIMITOR);
	    	int row = 1;
	    	
	    	// Skip header line
	    	line = reader.readLine();
	    	// Get value lines
	    	while (line != null) {
	    		
	    		String[] values = line.split(DELIMITOR);
	    		// Print line n°2
	    		if (row == 1) {
	    			System.out.println("Line # " + row);
		    		for (int col = 0; col < values.length; col++) {
		    			System.out.println(" - " + attributeNames[col] + ": " + values[col]);
		    		}
	    		}
	    		++row;
	    		line = reader.readLine();
	    	}
    	
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    
	    // End with a new empty line for readability
	    System.out.println();
	}

}
