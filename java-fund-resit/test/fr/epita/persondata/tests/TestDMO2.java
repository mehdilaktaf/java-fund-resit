package fr.epita.persondata.tests;

import fr.epita.persondata.datamodels.Person;

public class TestDMO2 {
	public static void test() {
		Person p = new Person("Mehdi", "M", 24, 191, 100);
		System.out.println(p);
		
	    // End with a new empty line for readability
	    System.out.println();
	}
}
