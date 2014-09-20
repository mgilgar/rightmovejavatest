package com.rightmove.report;

import java.util.List;

import com.rightmove.model.Person;

/**
 * This report consists of the calculation of the number of days Jeff Briton is older than Tom Soyer.
 * 
 * @author mgilgar
 *
 */
public class DaysJeffBritonIsOlderThanTomSoyerReportImpl implements
		PersonReport {

	private static final String JEFF_BRITON_FULL_NAME = "Jeff Briton";
	private static final String TOM_SOYER_FULL_NAME = "Tom Soyer";
	
	private static final long NUMBER_OF_MILISECONDS_IN_ONE_DAY = 1000*60*60*24;
	
	private static final String PREFIX ="Jeff Briton is ";
	private static final String SUFIX = " days older than Tom Soyer.\n";
	
	@Override
	public String report(final List<Person> persons) {
		return this.report(persons, JEFF_BRITON_FULL_NAME, TOM_SOYER_FULL_NAME);
	}

	/**
	 * Returns a string that consists of a report that informs of how many days person with full name 1 is older than person 
	 * with full name 2.
	 * @param persons the list of persons to consider to make the report
	 * @param fullName1 the full name of the person who is supposed to be older than the second person.
	 * @param fullName2 the full name of the person who is supposed to be younger than the first person.
	 * @return number of days person 1 is older than person 2. Negative number is provided is person 2 is
	 * older than person 1.
	 */
	protected String report(final List<Person> persons, final String fullName1, final String fullName2) {
		int person1Index = -1; // not found
		int person2Index = -1; // not found
		int i = 0;
		
		while ((person1Index == -1 || person2Index == -1) && i < persons.size()) {
			String fullName = persons.get(i).getFullName();
			if (fullName.equals(fullName1)) {
				person1Index = i;
			} else if (fullName.equals(fullName2)) {
				person2Index = i;
			}
			i++;
		}
		
		long days = (persons.get(person1Index).getDob().getTime() - persons.get(person2Index).getDob().getTime())
				/NUMBER_OF_MILISECONDS_IN_ONE_DAY;
		StringBuilder report = new StringBuilder(PREFIX).append(days).append(SUFIX);
		return report.toString();
	}
}
