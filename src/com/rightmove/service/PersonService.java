package com.rightmove.service;

import java.text.ParseException;

import com.rightmove.model.Person;

/**
 * Contains all operation a Person service should implement.
 * @author mgilgar
 *
 */
public interface PersonService {
	
	/**
	 * Given an input, it returns the corresponding Person.
	 * @param input the input that we will base our person on.
	 * @return a Person that is based in the given input.
	 * @throws ParseException
	 */
	Person buildPerson(final String input) throws ParseException;
	
}
