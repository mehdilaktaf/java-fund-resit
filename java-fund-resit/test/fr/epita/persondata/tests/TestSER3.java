package fr.epita.persondata.tests;

import java.io.File;
import java.util.List;

import fr.epita.persondata.datamodels.Person;
import fr.epita.persondata.services.PersonCSVDAO;

public class TestSER3 {
	private static final String FILENAME = "data.csv";

	public static void test() {
		// Get persons from data.csv
		PersonCSVDAO pDAO = new PersonCSVDAO();
		List<Person> persons = pDAO.readAll(new File(FILENAME));
		
		//Write persons in data_output.csv
		pDAO.writeAll(persons, new File("data_output.csv"));
		
	    // End with a new empty line for readability
	    System.out.println();
	}
}
