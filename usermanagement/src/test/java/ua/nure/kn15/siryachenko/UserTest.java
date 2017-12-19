package ua.nure.kn15.siryachenko;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import ua.nure.kn15.siryachenko.User;

public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirthd;
	private Date futureDateOfBirthd;
	
	private final int DAY_OF_BIRTHD = 9;
	private final int YEAR_OF_BIRTHD = 1998;
	private final int CURRENT_YEAR = 2017;
	private final int FUTURE_YEAR = 2100;


	@Before
	public void setUp() throws Exception {
		super.setUp();
		user = new User();
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTHD, Calendar.OCTOBER, DAY_OF_BIRTHD);
		dateOfBirthd = calendar.getTime();
		calendar.set(FUTURE_YEAR, Calendar.JANUARY, DAY_OF_BIRTHD);
		futureDateOfBirthd=calendar.getTime();
	}

	@Test
	public void testGetFullName() {
		user.setFirstName("Maxim");
		user.setLastName("Siryachenko");
		assertEquals("Siryachenko, Maxim", user.getFullName());
	}

	@Test
	public void testGetFullNameWithoutFirstName() {
		user.setFirstName("Maxim");
		try {
			user.getFullName();
			fail("IllegalStateException expecting");
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testGetFullNameWithoutSecondName() {
		user.setLastName("Siryachenko");
		try {
			user.getFullName();
			fail("IllegalStateException expecting");
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testGetAge() {
		user.setDateOfBirthd(dateOfBirthd);
		assertEquals(CURRENT_YEAR - YEAR_OF_BIRTHD, user.getAge());
	}

	@Test
	public void testEmptyAge() {
		try {
			user.getAge();
			fail("IllegalStateException expecting");
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testGetNonebornAge() {
		user.setDateOfBirthd(futureDateOfBirthd);
		try {
			user.getAge();
			fail("IllegalStateException expecting");
		} catch (IllegalStateException e) {
		}
	}
}
