package ua.nure.kn15.siryachenko.db;

public class DaoFactoryImpl extends DaoFactory {

	@Override
	public UserDao getUserDao() {
		UserDao result = null;
		try {
			Class<?> clazz = Class.forName(properties.getProperty("ua.nure.kn15.siryachenko.db.UserDao"));
			result = (UserDao) clazz.newInstance();
			result.setConnectionFactory(getConnectionFactory());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}
	
	
}
