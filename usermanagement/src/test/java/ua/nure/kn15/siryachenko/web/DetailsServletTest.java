package ua.nure.kn15.siryachenko.web;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Test;

import ua.nure.kn15.siryachenko.User;
import ua.nure.kn15.siryachenko.web.DetailsServlet;

public class DetailsServletTest extends MockServletTestCase {
	/**
	 * Constants FIRSTNAME, LASTNAME, DATE are used for deleting existing users and for
	 * filling fields
	 */

	private static final String LASTNAME = "Watson";
	private static final String FIRSTNAME = "Jhon";
	private final Date DATE = new Date();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createServlet(DetailsServlet.class);
	}

	@Test
	public void testDetails() {
		addRequestParameter("id", "1000");
		addRequestParameter("firstName", FIRSTNAME);
		addRequestParameter("lastName", LASTNAME);
		addRequestParameter("dateOfBirth", DateFormat.getDateInstance().format(DATE));
		addRequestParameter("okButton", "Ok");
		doPost();
	}
}
