package com.siryachenko.usermanagement;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import junit.framework.TestCase;

public class UserTest extends TestCase {
	
	private User user;
	private Date dateOfBirthd;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1984, Calendar.MAY, 26);
		dateOfBirthd = calendar.getTime();
		
	}
	
	public void testGetFullName() {
		user.setFirstName("John");
		user.setLastName("Doe");
		assertEquals("Doe, John", user.getFullName());
	}
	
	public void testGetAge() {
		user.setDateOfBirthd(dateOfBirthd);
		assertEquals(2006 - 1984, user.getAge());
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
