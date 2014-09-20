package com.rightmove.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.rightmove.model.Person;
import com.rightmove.model.Sex;

/**
 * Person Service.
 * 
 * @author mgilgar
 *
 */
public class PersonServiceImpl implements PersonService {

	SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Person buildPerson(final String input) throws ParseException {
		String[] columns = input.split(",");
		Person person = new Person();
		person.setFullName(columns[0].trim());
		person.setSex(Sex.valueOf(columns[1].trim()));
		person.setAge(Integer.valueOf(columns[2].trim()));
		person.setDob(DATE_FORMAT.parse(columns[3].trim()));
		return person;
	}
}
