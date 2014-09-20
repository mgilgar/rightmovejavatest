package com.rightmove;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.rightmove.model.Person;
import com.rightmove.report.AverageAgeReportImpl;
import com.rightmove.report.DaysJeffBritonIsOlderThanTomSoyerReportImpl;
import com.rightmove.report.NumberOfMalesReportImpl;
import com.rightmove.report.PersonReport;
import com.rightmove.service.PersonService;
import com.rightmove.service.PersonServiceImpl;

/** 
 * Main App
 * 
 * Contains a main method that allows to run it from the command line.
 * 
 * @author mgilgar
 *
 */
public class ManipulateDataApplication {

	PersonService personService;
	PersonReport numberOfMalesReport;
	PersonReport averageAgeReport;
	PersonReport daysJeffBritonIsOlderThanTomSoyerReport;
	
	ManipulateDataApplication() {
		personService = new PersonServiceImpl();
		numberOfMalesReport = new NumberOfMalesReportImpl();
		averageAgeReport = new AverageAgeReportImpl();
		daysJeffBritonIsOlderThanTomSoyerReport = new DaysJeffBritonIsOlderThanTomSoyerReportImpl();
	}
	
	/**
	 * Main method makes this class executable from command line.
	 * 
	 * @param args the list of arguments, arguments are ignored.
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void main(String[] args) throws IOException, ParseException {
		ManipulateDataApplication app = new ManipulateDataApplication();
		File file = new File("manipulate-data.txt");
		System.out.println(app.processAndGetOutput(file));
	}

	/**
	 * Generates a string with the reports according to the given input.
	 * 
	 * @param file the file containing the input to process and generate the reports for.
	 * @return a String representing the corresponding reports based on the given input.
	 * @throws IOException
	 * @throws ParseException
	 */
	public String processAndGetOutput(final File file) throws IOException, ParseException {
		
		System.out.println(file.getName() + " file exists = " + file.exists());

		List<Person> persons = new ArrayList<Person>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		boolean firstLine = true;
		while ((line = bufferedReader.readLine()) != null) {
			if (!firstLine) {
				Person person = personService.buildPerson(line);
				persons.add(person);
			}
			firstLine = false;
		}
		StringBuilder output = new StringBuilder()
			.append(numberOfMalesReport.report(persons))
			.append(averageAgeReport.report(persons))
			.append(daysJeffBritonIsOlderThanTomSoyerReport.report(persons));
		bufferedReader.close();		
		return output.toString();
	}
	
}