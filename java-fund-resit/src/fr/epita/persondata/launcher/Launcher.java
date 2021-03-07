package fr.epita.persondata.launcher;

import fr.epita.persondata.tests.TestDMO2;
import fr.epita.persondata.tests.TestSER1;
import fr.epita.persondata.tests.TestSER2;
import fr.epita.persondata.tests.TestSER3;

public class Launcher {

	// STATIC VARIABLES
	public static final String DELIMITOR = ",";
	public static final String FILENAME = "C:\\Users\\camel\\OneDrive\\Bureau\\data.csv";

	
	public static void main(String[] args) {
		TestDMO2.test();
		TestSER1.test();
		TestSER2.test();
		TestSER3.test();
	}

}
