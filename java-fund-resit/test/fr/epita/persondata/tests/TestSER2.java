package fr.epita.persondata.tests;

import java.io.File;
import java.util.List;

import fr.epita.persondata.datamodels.Person;
import fr.epita.persondata.services.PersonCSVDAO;

public class TestSER2 {
	
	private static final String FILENAME = "data.csv";

	public static void test() {
		PersonCSVDAO pDAO = new PersonCSVDAO();
		List<Person> persons = pDAO.readAll(new File(FILENAME));
		// Output list in console
		for (Person p : persons) {
			System.out.println(p);
		}
		

	    // End with a new empty line for readability
	    System.out.println();
	}
}
