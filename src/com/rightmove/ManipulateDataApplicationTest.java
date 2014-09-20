package com.rightmove;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for ManipulateDataApplication.
 * 
 * @author mgilgar
 *
 */
public class ManipulateDataApplicationTest {

	private static final String FILENAME = "manipulate-data.txt";
	
	private static final String EXPECTED_OUTPUT = 
			"There are 5 males.\n"
			+ "Average age is 27 years.\n" 
			+ "Jeff Briton is -29 days older than Tom Soyer.\n";
	
	private ManipulateDataApplication app;
	private File file;
	
	@Before
	public void setUp() {
		app = new ManipulateDataApplication();
		file = new File(FILENAME);
	}
	
	@Test
	public void processAndGetOutputShouldReturnExpectedOutput() throws IOException, ParseException {
		String output = app.processAndGetOutput(file);
		Assert.assertEquals(EXPECTED_OUTPUT, output);	
	}
	
}
