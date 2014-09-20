package com.rightmove.report;

import java.util.List;

import com.rightmove.model.Person;

/**
 * Contains all operations a Report should implement.
 * 
 * @author mgilgar
 *
 */
public interface PersonReport {
	
	/**
	 * Generates a report for the given list of persons.
	 * @param persons the persons to make the report about.
	 * @return a string containing the report based on the given persons.
	 */
	String report(final List<Person> persons);
	
}
