package ua.nure.kn15.siryachenko.web;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import ua.nure.kn15.siryachenko.User;
import ua.nure.kn15.siryachenko.web.BrowseServlet;

public class BrowseServletTest extends MockServletTestCase {
	/**
	 * user - constant user for testing
	 */
	private final User user = new User(1000L, "Jhon", "Watson", new Date());

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createServlet(BrowseServlet.class);
	}

	@Test
	public void testBrowse() {
		List<User> list = Collections.singletonList(user);
		getMockUserDao().expectAndReturn("findAll", list);
		doGet();
		@SuppressWarnings("unchecked")
		Collection<User> collection = (Collection<User>) getWebMockObjectFactory().getMockSession()
				.getAttribute("users");
		assertNotNull(collection);
		assertSame(list, collection);
	}

	@Test
	public void testEdit() {
		getMockUserDao().expectAndReturn("find", 1000L, user);
		addRequestParameter("editButton", "Edit");
		addRequestParameter("id", "1000");
		doPost();
		User userInSession = (User) getWebMockObjectFactory().getMockSession().getAttribute("user");
		assertNotNull(userInSession);
		assertSame(user, userInSession);
	}

}
