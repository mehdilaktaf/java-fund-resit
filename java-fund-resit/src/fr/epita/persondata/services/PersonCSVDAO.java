package fr.epita.persondata.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.epita.persondata.datamodels.Person;

/**
 * This class serializes/deserializes Person objects from/to csv files
 */
public class PersonCSVDAO {

	private static final String DELIMITOR = ",";
	
	public List<Person> readAll(File dataFile){
	
		List<String> lines;
		// Get every line using Files class method
		try {
			lines = Files.readAllLines(dataFile.toPath());
		} catch (IOException e) {
			System.out.println("Unable to load the file, " + e.getMessage());
			System.out.println("Check the configuration, the program will close now.");
			return new ArrayList<>();
		}
		
		// Create a list to store all persons from csv file
		List<Person> persons = new ArrayList<>();
		// Remove header line
		lines.remove(0);
		// For each line extract values and store the resulting person in array
		for(int i = 0; i < lines.size(); i++) {
			
			String line = lines.get(i); 
			
			
			String[] attributes = line.split(DELIMITOR);
			// Create a new person object from those attributes
			Person p = new Person();
			
			p.setName(attributes[0]);
			p.setSex(attributes[1]);
			p.setAge(Integer.valueOf(attributes[2].strip()));
			p.setHeight(Integer.valueOf(attributes[3].strip()));
			p.setWeight(Integer.valueOf(attributes[4].strip()));
			
			persons.add(p);
		}
		
		// Sort persons by height
		Collections.sort(persons);

		return persons;
	}
	

		
	public void writeAll(List<Person> persons, File file) {
		// Open file in write mode
		PrintWriter writer;
		try {
			 writer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("Not able to open the file in write mode : " + e.getMessage());
			System.out.println("Closing...");
			return;
			
		}
		
		// Write header line (with new order)
		writer.println("\"Name\", \"Height (in)\", \"Weight (lbs)\", \"Age\", \"Sex\"");
		
		// For each person in list write a line (with new order)
		for (Person person : persons) {
			System.out.println("Writing...");
			writer.print(person.getName() +DELIMITOR);
			writer.print( person.getHeight() + ""+DELIMITOR);
			writer.print( person.getWeight() + ""+DELIMITOR);
			writer.print( person.getAge()+ ""+DELIMITOR);
			writer.println( person.getSex());
			
		}
		
		System.out.println("File writing is done !");
		// Close file
		writer.flush();
		writer.close();
	}
	
}
