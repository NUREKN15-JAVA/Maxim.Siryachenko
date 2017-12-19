package ua.nure.kn15.siryachenko.db;

import org.junit.Test;

import junit.framework.TestCase;
import ua.nure.kn15.siryachenko.db.DaoFactory;
import ua.nure.kn15.siryachenko.db.UserDao;

public class DaoFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testGetUserDao() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		assertNotNull("DaoFactory instance is null",daoFactory);
		UserDao userDao = daoFactory.getUserDao();
		assertNotNull("UserDao instance is null", userDao);
	}
}
