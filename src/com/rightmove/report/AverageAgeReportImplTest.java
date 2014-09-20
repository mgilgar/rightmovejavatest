package com.rightmove.report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rightmove.model.Person;

/**
 * Test class for AverageAgeReportImpl.
 * 
 * @author mgilgar
 *
 */
public class AverageAgeReportImplTest {

	private static final int AGE1 = 10;
	private static final int AGE2 = 20;
	private static final int AGE3 = 36;
	private static final int EXPECTED_AVERAGE_AGE = (AGE1 + AGE2 + AGE3) / 3;
	private static final String EXPECTED_REPORT_STRING = "Average age is " + EXPECTED_AVERAGE_AGE + " years.\n";
	
	private List<Person> persons;
	private PersonReport report;
	
	@Before
	public void setUp() {
		report = new AverageAgeReportImpl();
		persons = new ArrayList<Person>();
		Person person1 = new Person();
		person1.setAge(AGE1);
		Person person2 = new Person();
		person2.setAge(AGE2);
		Person person3 = new Person();
		person3.setAge(AGE3);
		persons.addAll(Arrays.asList(person1, person2, person3));
	}
	
	@Test
	public void reportShouldReturnExpectedOutput() {
		String reportString = report.report(persons);
		Assert.assertEquals(EXPECTED_REPORT_STRING, reportString);
	}
}
