package com.rightmove.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rightmove.model.Person;
import com.rightmove.model.Sex;

/**
 * Test class for PersonServiceImpl.
 * 
 * @author mgilgar
 *
 */
public class PersonServiceImplTest {
	
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	private static final String INPUT = "Jeff Briton, male, 29, 16/03/1977";
	private static final String FULL_NAME = "Jeff Briton";
	private static final Sex SEX = Sex.male;
	private static final int AGE = 29;
	private static final String DOB_STRING = "16/03/1977";
	
	PersonService personService;
	
	@Before
	public void setUp() {
		personService = new PersonServiceImpl();
	}
	
	
	@Test
	public void buildPersonShouldReturnExpectedOutput() throws ParseException {
		Person person = personService.buildPerson(INPUT);
		Assert.assertEquals(AGE, person.getAge());
		Assert.assertEquals(FULL_NAME, person.getFullName());
		Assert.assertEquals(SIMPLE_DATE_FORMAT.parse(DOB_STRING), person.getDob());
		Assert.assertEquals(SEX, person.getSex());
	}
}
