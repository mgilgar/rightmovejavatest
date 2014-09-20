package com.rightmove.report;

import java.util.List;

import com.rightmove.model.Person;
import com.rightmove.model.Sex;

public class NumberOfMalesReportImpl implements PersonReport {

	private static final String PREFIX = "There are ";
	private static final String SUFIX = " males.\n";
	
	@Override
	public String report(final List<Person> persons) {
		int counter = 0;
		for (Person person: persons) {
			if (person.getSex().equals(Sex.male)) {
				counter++;
			}
		}
		StringBuilder report = new StringBuilder(PREFIX).append(counter).append(SUFIX);
		return report.toString();
	}

}
