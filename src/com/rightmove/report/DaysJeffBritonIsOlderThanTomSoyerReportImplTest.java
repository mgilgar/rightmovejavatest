package com.rightmove.report;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rightmove.model.Person;
import com.rightmove.model.Sex;

/**
 * Test class for DaysJeffBritonIsOlderThanTomSoyerReportImpl.
 * 
 * @author mgilgar
 *
 */
public class DaysJeffBritonIsOlderThanTomSoyerReportImplTest {

	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	
	private static final String FULLNAME1 = "Jeff Briton";
	private static final String FULLNAME2 = "Tom Soyer";
	private static final String FULLNAME3 = "Liam Bolt";
	private static final String DOB_STRING1 = "16/03/1977";
	private static final String DOB_STRING2 = "15/04/1977";
	private static final String DOB_STRING3 = "22/02/1980";
	private static final String EXPECTED_REPORT_STRING = FULLNAME1 + " is -29 days older than " + FULLNAME2 + ".\n";
	
	private List<Person> persons;
	private PersonReport report;
	
	@Before
	public void setUp() throws ParseException {
		report = new DaysJeffBritonIsOlderThanTomSoyerReportImpl();
		persons = new ArrayList<Person>();
		Person person1 = new Person();
		person1.setFullName(FULLNAME1);
		person1.setDob(SIMPLE_DATE_FORMAT.parse(DOB_STRING1));
		Person person2 = new Person();
		person2.setFullName(FULLNAME2);
		person2.setDob(SIMPLE_DATE_FORMAT.parse(DOB_STRING2));
		Person person3 = new Person();
		person3.setFullName(FULLNAME3);
		person3.setDob(SIMPLE_DATE_FORMAT.parse(DOB_STRING3));
		persons.addAll(Arrays.asList(person1, person2, person3));
	}
	
	@Test
	public void reportShouldReturnExpectedOutput() {
		String reportString = report.report(persons);
		Assert.assertEquals(EXPECTED_REPORT_STRING, reportString);
	}
}
