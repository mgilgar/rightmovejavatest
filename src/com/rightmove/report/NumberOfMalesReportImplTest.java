package com.rightmove.report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rightmove.model.Person;
import com.rightmove.model.Sex;

/**
 * Test class for NumberOfMalesReportImpl.
 * 
 * @author mgilgar
 *
 */
public class NumberOfMalesReportImplTest {

	private static final Sex SEX1 = Sex.male;
	private static final Sex SEX2 = Sex.female;
	private static final Sex SEX3 = Sex.female;
	private static final String EXPECTED_REPORT_STRING = "There are 1 males.\n";
	
	private List<Person> persons;
	private PersonReport report;
	
	@Before
	public void setUp() {
		report = new NumberOfMalesReportImpl();
		persons = new ArrayList<Person>();
		Person person1 = new Person();
		person1.setSex(SEX1);
		Person person2 = new Person();
		person2.setSex(SEX2);
		Person person3 = new Person();
		person3.setSex(SEX3);
		persons.addAll(Arrays.asList(person1, person2, person3));
	}
	
	@Test
	public void reportShouldReturnExpectedOutput() {
		String reportString = report.report(persons);
		Assert.assertEquals(EXPECTED_REPORT_STRING, reportString);
	}
}
