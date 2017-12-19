package ua.nure.kn15.siryachenko.db;

import java.util.Collection;

import ua.nure.kn15.siryachenko.User;

public interface UserDao {

	public User create(User user) throws DatabaseException;


	public void update(User user) throws DatabaseException;


	public void delete(User user) throws DatabaseException;


	public User find(Long id) throws DatabaseException;


	public Collection<User> findAll() throws DatabaseException;

	public void setConnectionFactory(ConnectionFactory connectionFactory);
}
