package com.rightmove.report;

import java.util.List;

import com.rightmove.model.Person;

/**
 * This report consists of the calculation of the average age of a given list of persons.
 * 
 * @author mgilgar
 *
 */
public class AverageAgeReportImpl implements PersonReport {

	private static final String PREFIX = "Average age is ";
	private static final String SUFIX = " years.\n";
	
	@Override
	public String report(final List<Person> persons) {
		int totalAge = 0;
		for (Person person: persons) {
			totalAge = totalAge + person.getAge();
		}
		int averageAge = totalAge / persons.size();
		StringBuilder report = new StringBuilder(PREFIX).append(averageAge).append(SUFIX);
		return report.toString();
	}

}
